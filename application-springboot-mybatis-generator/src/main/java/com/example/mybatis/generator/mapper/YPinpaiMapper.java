package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YPinpai;
import com.example.mybatis.generator.entity.YPinpaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YPinpaiMapper {
    long countByExample(YPinpaiExample example);

    int deleteByExample(YPinpaiExample example);

    int deleteByPrimaryKey(Short id);

    int insert(YPinpai record);

    int insertSelective(YPinpai record);

    List<YPinpai> selectByExampleWithBLOBs(YPinpaiExample example);

    List<YPinpai> selectByExample(YPinpaiExample example);

    YPinpai selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") YPinpai record, @Param("example") YPinpaiExample example);

    int updateByExampleWithBLOBs(@Param("record") YPinpai record, @Param("example") YPinpaiExample example);

    int updateByExample(@Param("record") YPinpai record, @Param("example") YPinpaiExample example);

    int updateByPrimaryKeySelective(YPinpai record);

    int updateByPrimaryKeyWithBLOBs(YPinpai record);

    int updateByPrimaryKey(YPinpai record);
}