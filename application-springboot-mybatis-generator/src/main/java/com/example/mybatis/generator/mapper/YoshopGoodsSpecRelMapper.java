package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopGoodsSpecRel;
import com.example.mybatis.generator.entity.YoshopGoodsSpecRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopGoodsSpecRelMapper {
    long countByExample(YoshopGoodsSpecRelExample example);

    int deleteByExample(YoshopGoodsSpecRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoshopGoodsSpecRel record);

    int insertSelective(YoshopGoodsSpecRel record);

    List<YoshopGoodsSpecRel> selectByExample(YoshopGoodsSpecRelExample example);

    YoshopGoodsSpecRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoshopGoodsSpecRel record, @Param("example") YoshopGoodsSpecRelExample example);

    int updateByExample(@Param("record") YoshopGoodsSpecRel record, @Param("example") YoshopGoodsSpecRelExample example);

    int updateByPrimaryKeySelective(YoshopGoodsSpecRel record);

    int updateByPrimaryKey(YoshopGoodsSpecRel record);
}