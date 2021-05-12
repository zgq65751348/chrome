package com.google.chrome.tools.plugin;


import com.google.chrome.tools.annotation.Shield;
import com.google.chrome.tools.annotation.ShieldStrategy;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;
import java.lang.reflect.Field;
import java.sql.Statement;
import java.util.Collection;
import java.util.stream.Stream;


/**
 * mybatis打印sql拦截器
 * 前拦截从外面到里面，后拦截是从里面到外面
 * 拦截器四个对象： Executor(执行器）、ParameterHandler(参数设置)、ResultSetHandler(结果集处理)、StatementHandler(sql语法构建器）
 */
@Component
@Intercepts(@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = Statement.class))
public class ShieldPlugin implements Interceptor {

    /**
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Collection<Object> recodes = (Collection<Object>) invocation.proceed();
        if(recodes.size() != 0){
            recodes.forEach(this::shield);
            return recodes;
        }
       return null;
    }

    void shield(Object source) {
        Class<?> sourceClass = source.getClass();
        MetaObject metaObject = SystemMetaObject.forObject(source);
        Stream.of(sourceClass.getDeclaredFields())
                .filter(field ->
                        field.isAnnotationPresent(Shield.class)).forEach(field -> doShied(metaObject, field));

    }

    void doShied(MetaObject metaObject, Field field) {
        String name = field.getName();
        Object value = metaObject.getValue(name);
        if (String.class == metaObject.getGetterType(name) && value != null) {
            Shield shield = field.getAnnotation(Shield.class);
            ShieldStrategy strategy = shield.strategy();
            Object target = strategy.getShieldExecute().apply((String) value);
            metaObject.setValue(name, target);
        }
    }
}
