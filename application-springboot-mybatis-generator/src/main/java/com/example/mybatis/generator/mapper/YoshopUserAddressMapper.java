package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopUserAddress;
import com.example.mybatis.generator.entity.YoshopUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopUserAddressMapper {
    long countByExample(YoshopUserAddressExample example);

    int deleteByExample(YoshopUserAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(YoshopUserAddress record);

    int insertSelective(YoshopUserAddress record);

    List<YoshopUserAddress> selectByExample(YoshopUserAddressExample example);

    YoshopUserAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") YoshopUserAddress record, @Param("example") YoshopUserAddressExample example);

    int updateByExample(@Param("record") YoshopUserAddress record, @Param("example") YoshopUserAddressExample example);

    int updateByPrimaryKeySelective(YoshopUserAddress record);

    int updateByPrimaryKey(YoshopUserAddress record);
}