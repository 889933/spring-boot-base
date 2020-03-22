package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopOrderAddress;
import com.example.mybatis.generator.entity.YoshopOrderAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopOrderAddressMapper {
    long countByExample(YoshopOrderAddressExample example);

    int deleteByExample(YoshopOrderAddressExample example);

    int deleteByPrimaryKey(Integer orderAddressId);

    int insert(YoshopOrderAddress record);

    int insertSelective(YoshopOrderAddress record);

    List<YoshopOrderAddress> selectByExample(YoshopOrderAddressExample example);

    YoshopOrderAddress selectByPrimaryKey(Integer orderAddressId);

    int updateByExampleSelective(@Param("record") YoshopOrderAddress record, @Param("example") YoshopOrderAddressExample example);

    int updateByExample(@Param("record") YoshopOrderAddress record, @Param("example") YoshopOrderAddressExample example);

    int updateByPrimaryKeySelective(YoshopOrderAddress record);

    int updateByPrimaryKey(YoshopOrderAddress record);
}