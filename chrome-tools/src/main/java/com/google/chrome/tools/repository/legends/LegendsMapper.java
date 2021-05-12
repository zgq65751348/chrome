package com.google.chrome.tools.repository.legends;

import com.google.chrome.tools.model.legends.Legends;
import com.google.chrome.tools.model.legends.LegendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LegendsMapper {
    int countByExample(LegendsExample example);

    int deleteByExample(LegendsExample example);

    int insert(Legends record);

    int insertSelective(Legends record);

    List<Legends> selectByExample(LegendsExample example);

    int updateByExampleSelective(@Param("record") Legends record, @Param("example") LegendsExample example);

    int updateByExample(@Param("record") Legends record, @Param("example") LegendsExample example);
}