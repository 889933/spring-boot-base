package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YQq;
import com.example.mybatis.generator.entity.YQqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YQqMapper {
    long countByExample(YQqExample example);

    int deleteByExample(YQqExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(YQq record);

    int insertSelective(YQq record);

    List<YQq> selectByExample(YQqExample example);

    YQq selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") YQq record, @Param("example") YQqExample example);

    int updateByExample(@Param("record") YQq record, @Param("example") YQqExample example);

    int updateByPrimaryKeySelective(YQq record);

    int updateByPrimaryKey(YQq record);
}