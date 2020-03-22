package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YNews;
import com.example.mybatis.generator.entity.YNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YNewsMapper {
    long countByExample(YNewsExample example);

    int deleteByExample(YNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YNews record);

    int insertSelective(YNews record);

    List<YNews> selectByExampleWithBLOBs(YNewsExample example);

    List<YNews> selectByExample(YNewsExample example);

    YNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YNews record, @Param("example") YNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") YNews record, @Param("example") YNewsExample example);

    int updateByExample(@Param("record") YNews record, @Param("example") YNewsExample example);

    int updateByPrimaryKeySelective(YNews record);

    int updateByPrimaryKeyWithBLOBs(YNews record);

    int updateByPrimaryKey(YNews record);
}