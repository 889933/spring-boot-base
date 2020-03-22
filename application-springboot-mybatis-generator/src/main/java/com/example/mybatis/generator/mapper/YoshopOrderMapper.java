package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopOrder;
import com.example.mybatis.generator.entity.YoshopOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopOrderMapper {
    long countByExample(YoshopOrderExample example);

    int deleteByExample(YoshopOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(YoshopOrder record);

    int insertSelective(YoshopOrder record);

    List<YoshopOrder> selectByExample(YoshopOrderExample example);

    YoshopOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") YoshopOrder record, @Param("example") YoshopOrderExample example);

    int updateByExample(@Param("record") YoshopOrder record, @Param("example") YoshopOrderExample example);

    int updateByPrimaryKeySelective(YoshopOrder record);

    int updateByPrimaryKey(YoshopOrder record);
}