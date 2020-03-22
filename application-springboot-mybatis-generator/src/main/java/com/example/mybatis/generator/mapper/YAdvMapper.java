package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YAdv;
import com.example.mybatis.generator.entity.YAdvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAdvMapper {
    long countByExample(YAdvExample example);

    int deleteByExample(YAdvExample example);

    int deleteByPrimaryKey(Short id);

    int insert(YAdv record);

    int insertSelective(YAdv record);

    List<YAdv> selectByExample(YAdvExample example);

    YAdv selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") YAdv record, @Param("example") YAdvExample example);

    int updateByExample(@Param("record") YAdv record, @Param("example") YAdvExample example);

    int updateByPrimaryKeySelective(YAdv record);

    int updateByPrimaryKey(YAdv record);
}