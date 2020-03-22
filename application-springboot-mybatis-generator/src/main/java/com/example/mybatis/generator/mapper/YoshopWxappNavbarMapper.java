package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopWxappNavbar;
import com.example.mybatis.generator.entity.YoshopWxappNavbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopWxappNavbarMapper {
    long countByExample(YoshopWxappNavbarExample example);

    int deleteByExample(YoshopWxappNavbarExample example);

    int deleteByPrimaryKey(Integer wxappId);

    int insert(YoshopWxappNavbar record);

    int insertSelective(YoshopWxappNavbar record);

    List<YoshopWxappNavbar> selectByExample(YoshopWxappNavbarExample example);

    YoshopWxappNavbar selectByPrimaryKey(Integer wxappId);

    int updateByExampleSelective(@Param("record") YoshopWxappNavbar record, @Param("example") YoshopWxappNavbarExample example);

    int updateByExample(@Param("record") YoshopWxappNavbar record, @Param("example") YoshopWxappNavbarExample example);

    int updateByPrimaryKeySelective(YoshopWxappNavbar record);

    int updateByPrimaryKey(YoshopWxappNavbar record);
}