package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopWxapp;
import com.example.mybatis.generator.entity.YoshopWxappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopWxappMapper {
    long countByExample(YoshopWxappExample example);

    int deleteByExample(YoshopWxappExample example);

    int deleteByPrimaryKey(Integer wxappId);

    int insert(YoshopWxapp record);

    int insertSelective(YoshopWxapp record);

    List<YoshopWxapp> selectByExample(YoshopWxappExample example);

    YoshopWxapp selectByPrimaryKey(Integer wxappId);

    int updateByExampleSelective(@Param("record") YoshopWxapp record, @Param("example") YoshopWxappExample example);

    int updateByExample(@Param("record") YoshopWxapp record, @Param("example") YoshopWxappExample example);

    int updateByPrimaryKeySelective(YoshopWxapp record);

    int updateByPrimaryKey(YoshopWxapp record);
}