package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopRegion;
import com.example.mybatis.generator.entity.YoshopRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopRegionMapper {
    long countByExample(YoshopRegionExample example);

    int deleteByExample(YoshopRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoshopRegion record);

    int insertSelective(YoshopRegion record);

    List<YoshopRegion> selectByExample(YoshopRegionExample example);

    YoshopRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoshopRegion record, @Param("example") YoshopRegionExample example);

    int updateByExample(@Param("record") YoshopRegion record, @Param("example") YoshopRegionExample example);

    int updateByPrimaryKeySelective(YoshopRegion record);

    int updateByPrimaryKey(YoshopRegion record);
}