package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YJob;
import com.example.mybatis.generator.entity.YJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YJobMapper {
    long countByExample(YJobExample example);

    int deleteByExample(YJobExample example);

    int deleteByPrimaryKey(Short id);

    int insert(YJob record);

    int insertSelective(YJob record);

    List<YJob> selectByExample(YJobExample example);

    YJob selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") YJob record, @Param("example") YJobExample example);

    int updateByExample(@Param("record") YJob record, @Param("example") YJobExample example);

    int updateByPrimaryKeySelective(YJob record);

    int updateByPrimaryKey(YJob record);
}