package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopGoods;
import com.example.mybatis.generator.entity.YoshopGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopGoodsMapper {
    long countByExample(YoshopGoodsExample example);

    int deleteByExample(YoshopGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(YoshopGoods record);

    int insertSelective(YoshopGoods record);

    List<YoshopGoods> selectByExampleWithBLOBs(YoshopGoodsExample example);

    List<YoshopGoods> selectByExample(YoshopGoodsExample example);

    YoshopGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") YoshopGoods record, @Param("example") YoshopGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopGoods record, @Param("example") YoshopGoodsExample example);

    int updateByExample(@Param("record") YoshopGoods record, @Param("example") YoshopGoodsExample example);

    int updateByPrimaryKeySelective(YoshopGoods record);

    int updateByPrimaryKeyWithBLOBs(YoshopGoods record);

    int updateByPrimaryKey(YoshopGoods record);
}