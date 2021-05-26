package com.google.chrome.tools.repository.mall;

import com.google.chrome.tools.model.mall.Processor;
import com.google.chrome.tools.model.mall.ProcessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProcessorMapper {
    int countByExample(ProcessorExample example);

    int deleteByExample(ProcessorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Processor record);

    int insertSelective(Processor record);

    List<Processor> selectByExample(ProcessorExample example);

    Processor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Processor record, @Param("example") ProcessorExample example);

    int updateByExample(@Param("record") Processor record, @Param("example") ProcessorExample example);

    int updateByPrimaryKeySelective(Processor record);

    int updateByPrimaryKey(Processor record);
}