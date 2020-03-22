package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopSetting;
import com.example.mybatis.generator.entity.YoshopSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopSettingMapper {
    long countByExample(YoshopSettingExample example);

    int deleteByExample(YoshopSettingExample example);

    int insert(YoshopSetting record);

    int insertSelective(YoshopSetting record);

    List<YoshopSetting> selectByExampleWithBLOBs(YoshopSettingExample example);

    List<YoshopSetting> selectByExample(YoshopSettingExample example);

    int updateByExampleSelective(@Param("record") YoshopSetting record, @Param("example") YoshopSettingExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopSetting record, @Param("example") YoshopSettingExample example);

    int updateByExample(@Param("record") YoshopSetting record, @Param("example") YoshopSettingExample example);
}