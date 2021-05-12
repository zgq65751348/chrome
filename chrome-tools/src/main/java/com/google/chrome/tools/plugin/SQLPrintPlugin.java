package com.google.chrome.tools.plugin;


import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * mybatis打印sql拦截器
 * 前拦截从外面到里面，后拦截是从里面到外面
 * 拦截器四个对象： Executor(执行器）、ParameterHandler(参数设置)、ResultSetHandler(结果集处理)、StatementHandler(sql语法构建器）
 */

@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
@Component
@Slf4j(topic = "mybatis打印sql拦截器")
public class SQLPrintPlugin implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object obj = invocation.getArgs()[1];
        BoundSql boundSql = mappedStatement.getBoundSql(obj);
        Configuration configuration = mappedStatement.getConfiguration();
        long start = System.currentTimeMillis();
        Object result = null;
        try {
            result = invocation.proceed();
        } finally {
            long end = System.currentTimeMillis();
            log.info("====> SQL执行时间 ：{}ms", end - start);
            String sql = getSql(configuration, boundSql);
            log.info("====>执行SQL语句: {}", sql);
        }


        return result;
    }

    public String getSql(Configuration configuration, BoundSql boundSql) {
        String sql = boundSql.getSql();
        if (StringUtils.isEmpty(sql)) {
            return "";
        }
        sql = beautifySql(sql);
        Object param = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();   //#{}
        if (!CollectionUtils.isEmpty(parameterMappings) && param != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(param.getClass())) {
                sql = replaceSql(sql, param);
            } else {
                MetaObject metaObject = configuration.newMetaObject(param);
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object object = metaObject.getValue(propertyName);
                        sql = replaceSql(sql, object);
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {  //判断批量操作动态参数
                        Object object = boundSql.getAdditionalParameter(propertyName);
                        sql = replaceSql(sql, object);
                    }
                }
            }
        }
        return sql;
    }

    private String replaceSql(String sql, Object param) {
        String result;
        if (param instanceof String) {
            result = "'" + param.toString() + "'";
        } else if (param instanceof Date) {
            result = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(param) + "'";
        } else {
            result = param.toString();
        }
        return sql.replaceFirst("\\?", result);
    }

    public String beautifySql(String sql) {
        return sql.replaceAll("[\\s\n]+", " ");
    }
}
