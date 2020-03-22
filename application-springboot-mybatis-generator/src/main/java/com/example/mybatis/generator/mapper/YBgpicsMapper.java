package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YBgpics;
import com.example.mybatis.generator.entity.YBgpicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YBgpicsMapper {
    long countByExample(YBgpicsExample example);

    int deleteByExample(YBgpicsExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(YBgpics record);

    int insertSelective(YBgpics record);

    List<YBgpics> selectByExample(YBgpicsExample example);

    YBgpics selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") YBgpics record, @Param("example") YBgpicsExample example);

    int updateByExample(@Param("record") YBgpics record, @Param("example") YBgpicsExample example);

    int updateByPrimaryKeySelective(YBgpics record);

    int updateByPrimaryKey(YBgpics record);
}