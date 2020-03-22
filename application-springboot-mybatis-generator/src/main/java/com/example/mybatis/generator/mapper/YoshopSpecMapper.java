package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopSpec;
import com.example.mybatis.generator.entity.YoshopSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopSpecMapper {
    long countByExample(YoshopSpecExample example);

    int deleteByExample(YoshopSpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(YoshopSpec record);

    int insertSelective(YoshopSpec record);

    List<YoshopSpec> selectByExample(YoshopSpecExample example);

    YoshopSpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") YoshopSpec record, @Param("example") YoshopSpecExample example);

    int updateByExample(@Param("record") YoshopSpec record, @Param("example") YoshopSpecExample example);

    int updateByPrimaryKeySelective(YoshopSpec record);

    int updateByPrimaryKey(YoshopSpec record);
}