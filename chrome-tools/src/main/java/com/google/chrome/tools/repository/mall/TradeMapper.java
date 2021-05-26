package com.google.chrome.tools.repository.mall;

import com.google.chrome.tools.model.mall.Trade;
import com.google.chrome.tools.model.mall.TradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TradeMapper {
    int countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}