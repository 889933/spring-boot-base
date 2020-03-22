package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YConfig;
import com.example.mybatis.generator.entity.YConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YConfigMapper {
    long countByExample(YConfigExample example);

    int deleteByExample(YConfigExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(YConfig record);

    int insertSelective(YConfig record);

    List<YConfig> selectByExample(YConfigExample example);

    YConfig selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") YConfig record, @Param("example") YConfigExample example);

    int updateByExample(@Param("record") YConfig record, @Param("example") YConfigExample example);

    int updateByPrimaryKeySelective(YConfig record);

    int updateByPrimaryKey(YConfig record);
}