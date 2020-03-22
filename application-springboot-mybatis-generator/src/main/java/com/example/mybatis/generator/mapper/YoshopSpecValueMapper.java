package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopSpecValue;
import com.example.mybatis.generator.entity.YoshopSpecValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopSpecValueMapper {
    long countByExample(YoshopSpecValueExample example);

    int deleteByExample(YoshopSpecValueExample example);

    int deleteByPrimaryKey(Integer specValueId);

    int insert(YoshopSpecValue record);

    int insertSelective(YoshopSpecValue record);

    List<YoshopSpecValue> selectByExample(YoshopSpecValueExample example);

    YoshopSpecValue selectByPrimaryKey(Integer specValueId);

    int updateByExampleSelective(@Param("record") YoshopSpecValue record, @Param("example") YoshopSpecValueExample example);

    int updateByExample(@Param("record") YoshopSpecValue record, @Param("example") YoshopSpecValueExample example);

    int updateByPrimaryKeySelective(YoshopSpecValue record);

    int updateByPrimaryKey(YoshopSpecValue record);
}