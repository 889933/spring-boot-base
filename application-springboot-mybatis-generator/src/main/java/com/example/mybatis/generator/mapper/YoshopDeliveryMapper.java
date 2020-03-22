package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopDelivery;
import com.example.mybatis.generator.entity.YoshopDeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopDeliveryMapper {
    long countByExample(YoshopDeliveryExample example);

    int deleteByExample(YoshopDeliveryExample example);

    int deleteByPrimaryKey(Integer deliveryId);

    int insert(YoshopDelivery record);

    int insertSelective(YoshopDelivery record);

    List<YoshopDelivery> selectByExample(YoshopDeliveryExample example);

    YoshopDelivery selectByPrimaryKey(Integer deliveryId);

    int updateByExampleSelective(@Param("record") YoshopDelivery record, @Param("example") YoshopDeliveryExample example);

    int updateByExample(@Param("record") YoshopDelivery record, @Param("example") YoshopDeliveryExample example);

    int updateByPrimaryKeySelective(YoshopDelivery record);

    int updateByPrimaryKey(YoshopDelivery record);
}