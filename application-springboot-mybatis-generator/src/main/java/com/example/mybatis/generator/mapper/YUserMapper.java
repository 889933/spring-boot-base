package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YUser;
import com.example.mybatis.generator.entity.YUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YUserMapper {
    long countByExample(YUserExample example);

    int deleteByExample(YUserExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(YUser record);

    int insertSelective(YUser record);

    List<YUser> selectByExample(YUserExample example);

    YUser selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") YUser record, @Param("example") YUserExample example);

    int updateByExample(@Param("record") YUser record, @Param("example") YUserExample example);

    int updateByPrimaryKeySelective(YUser record);

    int updateByPrimaryKey(YUser record);
}