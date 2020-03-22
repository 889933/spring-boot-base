package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopDictionary;
import com.example.mybatis.generator.entity.YoshopDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopDictionaryMapper {
    long countByExample(YoshopDictionaryExample example);

    int deleteByExample(YoshopDictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoshopDictionary record);

    int insertSelective(YoshopDictionary record);

    List<YoshopDictionary> selectByExample(YoshopDictionaryExample example);

    YoshopDictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoshopDictionary record, @Param("example") YoshopDictionaryExample example);

    int updateByExample(@Param("record") YoshopDictionary record, @Param("example") YoshopDictionaryExample example);

    int updateByPrimaryKeySelective(YoshopDictionary record);

    int updateByPrimaryKey(YoshopDictionary record);
}