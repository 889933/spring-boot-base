package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YGoods;
import com.example.mybatis.generator.entity.YGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YGoodsMapper {
    long countByExample(YGoodsExample example);

    int deleteByExample(YGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YGoods record);

    int insertSelective(YGoods record);

    List<YGoods> selectByExampleWithBLOBs(YGoodsExample example);

    List<YGoods> selectByExample(YGoodsExample example);

    YGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YGoods record, @Param("example") YGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") YGoods record, @Param("example") YGoodsExample example);

    int updateByExample(@Param("record") YGoods record, @Param("example") YGoodsExample example);

    int updateByPrimaryKeySelective(YGoods record);

    int updateByPrimaryKeyWithBLOBs(YGoods record);

    int updateByPrimaryKey(YGoods record);
}