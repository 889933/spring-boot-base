package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopCategory;
import com.example.mybatis.generator.entity.YoshopCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopCategoryMapper {
    long countByExample(YoshopCategoryExample example);

    int deleteByExample(YoshopCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(YoshopCategory record);

    int insertSelective(YoshopCategory record);

    List<YoshopCategory> selectByExample(YoshopCategoryExample example);

    YoshopCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") YoshopCategory record, @Param("example") YoshopCategoryExample example);

    int updateByExample(@Param("record") YoshopCategory record, @Param("example") YoshopCategoryExample example);

    int updateByPrimaryKeySelective(YoshopCategory record);

    int updateByPrimaryKey(YoshopCategory record);
}