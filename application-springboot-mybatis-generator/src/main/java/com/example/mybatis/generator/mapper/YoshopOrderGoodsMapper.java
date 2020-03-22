package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopOrderGoods;
import com.example.mybatis.generator.entity.YoshopOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopOrderGoodsMapper {
    long countByExample(YoshopOrderGoodsExample example);

    int deleteByExample(YoshopOrderGoodsExample example);

    int deleteByPrimaryKey(Integer orderGoodsId);

    int insert(YoshopOrderGoods record);

    int insertSelective(YoshopOrderGoods record);

    List<YoshopOrderGoods> selectByExampleWithBLOBs(YoshopOrderGoodsExample example);

    List<YoshopOrderGoods> selectByExample(YoshopOrderGoodsExample example);

    YoshopOrderGoods selectByPrimaryKey(Integer orderGoodsId);

    int updateByExampleSelective(@Param("record") YoshopOrderGoods record, @Param("example") YoshopOrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopOrderGoods record, @Param("example") YoshopOrderGoodsExample example);

    int updateByExample(@Param("record") YoshopOrderGoods record, @Param("example") YoshopOrderGoodsExample example);

    int updateByPrimaryKeySelective(YoshopOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(YoshopOrderGoods record);

    int updateByPrimaryKey(YoshopOrderGoods record);
}