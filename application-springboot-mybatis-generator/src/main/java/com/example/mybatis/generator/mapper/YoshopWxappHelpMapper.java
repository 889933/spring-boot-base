package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopWxappHelp;
import com.example.mybatis.generator.entity.YoshopWxappHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopWxappHelpMapper {
    long countByExample(YoshopWxappHelpExample example);

    int deleteByExample(YoshopWxappHelpExample example);

    int deleteByPrimaryKey(Integer helpId);

    int insert(YoshopWxappHelp record);

    int insertSelective(YoshopWxappHelp record);

    List<YoshopWxappHelp> selectByExampleWithBLOBs(YoshopWxappHelpExample example);

    List<YoshopWxappHelp> selectByExample(YoshopWxappHelpExample example);

    YoshopWxappHelp selectByPrimaryKey(Integer helpId);

    int updateByExampleSelective(@Param("record") YoshopWxappHelp record, @Param("example") YoshopWxappHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopWxappHelp record, @Param("example") YoshopWxappHelpExample example);

    int updateByExample(@Param("record") YoshopWxappHelp record, @Param("example") YoshopWxappHelpExample example);

    int updateByPrimaryKeySelective(YoshopWxappHelp record);

    int updateByPrimaryKeyWithBLOBs(YoshopWxappHelp record);

    int updateByPrimaryKey(YoshopWxappHelp record);
}