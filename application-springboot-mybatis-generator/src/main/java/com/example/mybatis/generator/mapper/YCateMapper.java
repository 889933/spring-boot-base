package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YCate;
import com.example.mybatis.generator.entity.YCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCateMapper {
    long countByExample(YCateExample example);

    int deleteByExample(YCateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YCate record);

    int insertSelective(YCate record);

    List<YCate> selectByExample(YCateExample example);

    YCate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YCate record, @Param("example") YCateExample example);

    int updateByExample(@Param("record") YCate record, @Param("example") YCateExample example);

    int updateByPrimaryKeySelective(YCate record);

    int updateByPrimaryKey(YCate record);
}