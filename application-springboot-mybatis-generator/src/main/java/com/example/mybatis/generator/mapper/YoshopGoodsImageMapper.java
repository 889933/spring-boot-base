package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopGoodsImage;
import com.example.mybatis.generator.entity.YoshopGoodsImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopGoodsImageMapper {
    long countByExample(YoshopGoodsImageExample example);

    int deleteByExample(YoshopGoodsImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoshopGoodsImage record);

    int insertSelective(YoshopGoodsImage record);

    List<YoshopGoodsImage> selectByExample(YoshopGoodsImageExample example);

    YoshopGoodsImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoshopGoodsImage record, @Param("example") YoshopGoodsImageExample example);

    int updateByExample(@Param("record") YoshopGoodsImage record, @Param("example") YoshopGoodsImageExample example);

    int updateByPrimaryKeySelective(YoshopGoodsImage record);

    int updateByPrimaryKey(YoshopGoodsImage record);
}