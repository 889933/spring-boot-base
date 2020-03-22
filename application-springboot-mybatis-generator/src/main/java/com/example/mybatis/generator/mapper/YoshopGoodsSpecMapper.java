package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopGoodsSpec;
import com.example.mybatis.generator.entity.YoshopGoodsSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopGoodsSpecMapper {
    long countByExample(YoshopGoodsSpecExample example);

    int deleteByExample(YoshopGoodsSpecExample example);

    int deleteByPrimaryKey(Integer goodsSpecId);

    int insert(YoshopGoodsSpec record);

    int insertSelective(YoshopGoodsSpec record);

    List<YoshopGoodsSpec> selectByExample(YoshopGoodsSpecExample example);

    YoshopGoodsSpec selectByPrimaryKey(Integer goodsSpecId);

    int updateByExampleSelective(@Param("record") YoshopGoodsSpec record, @Param("example") YoshopGoodsSpecExample example);

    int updateByExample(@Param("record") YoshopGoodsSpec record, @Param("example") YoshopGoodsSpecExample example);

    int updateByPrimaryKeySelective(YoshopGoodsSpec record);

    int updateByPrimaryKey(YoshopGoodsSpec record);
}