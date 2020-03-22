package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YMsgs;
import com.example.mybatis.generator.entity.YMsgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMsgsMapper {
    long countByExample(YMsgsExample example);

    int deleteByExample(YMsgsExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(YMsgs record);

    int insertSelective(YMsgs record);

    List<YMsgs> selectByExample(YMsgsExample example);

    YMsgs selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") YMsgs record, @Param("example") YMsgsExample example);

    int updateByExample(@Param("record") YMsgs record, @Param("example") YMsgsExample example);

    int updateByPrimaryKeySelective(YMsgs record);

    int updateByPrimaryKey(YMsgs record);
}