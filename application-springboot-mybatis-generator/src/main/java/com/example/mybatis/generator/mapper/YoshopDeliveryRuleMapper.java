package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopDeliveryRule;
import com.example.mybatis.generator.entity.YoshopDeliveryRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopDeliveryRuleMapper {
    long countByExample(YoshopDeliveryRuleExample example);

    int deleteByExample(YoshopDeliveryRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(YoshopDeliveryRule record);

    int insertSelective(YoshopDeliveryRule record);

    List<YoshopDeliveryRule> selectByExampleWithBLOBs(YoshopDeliveryRuleExample example);

    List<YoshopDeliveryRule> selectByExample(YoshopDeliveryRuleExample example);

    YoshopDeliveryRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") YoshopDeliveryRule record, @Param("example") YoshopDeliveryRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopDeliveryRule record, @Param("example") YoshopDeliveryRuleExample example);

    int updateByExample(@Param("record") YoshopDeliveryRule record, @Param("example") YoshopDeliveryRuleExample example);

    int updateByPrimaryKeySelective(YoshopDeliveryRule record);

    int updateByPrimaryKeyWithBLOBs(YoshopDeliveryRule record);

    int updateByPrimaryKey(YoshopDeliveryRule record);
}