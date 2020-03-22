package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YGoodsClass;
import com.example.mybatis.generator.entity.YGoodsClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YGoodsClassMapper {
    long countByExample(YGoodsClassExample example);

    int deleteByExample(YGoodsClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YGoodsClass record);

    int insertSelective(YGoodsClass record);

    List<YGoodsClass> selectByExample(YGoodsClassExample example);

    YGoodsClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YGoodsClass record, @Param("example") YGoodsClassExample example);

    int updateByExample(@Param("record") YGoodsClass record, @Param("example") YGoodsClassExample example);

    int updateByPrimaryKeySelective(YGoodsClass record);

    int updateByPrimaryKey(YGoodsClass record);
}