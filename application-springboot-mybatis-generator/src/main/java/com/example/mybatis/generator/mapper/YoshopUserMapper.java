package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopUser;
import com.example.mybatis.generator.entity.YoshopUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopUserMapper {
    long countByExample(YoshopUserExample example);

    int deleteByExample(YoshopUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(YoshopUser record);

    int insertSelective(YoshopUser record);

    List<YoshopUser> selectByExample(YoshopUserExample example);

    YoshopUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") YoshopUser record, @Param("example") YoshopUserExample example);

    int updateByExample(@Param("record") YoshopUser record, @Param("example") YoshopUserExample example);

    int updateByPrimaryKeySelective(YoshopUser record);

    int updateByPrimaryKey(YoshopUser record);
}