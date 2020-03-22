package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YHonor;
import com.example.mybatis.generator.entity.YHonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHonorMapper {
    long countByExample(YHonorExample example);

    int deleteByExample(YHonorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YHonor record);

    int insertSelective(YHonor record);

    List<YHonor> selectByExample(YHonorExample example);

    YHonor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YHonor record, @Param("example") YHonorExample example);

    int updateByExample(@Param("record") YHonor record, @Param("example") YHonorExample example);

    int updateByPrimaryKeySelective(YHonor record);

    int updateByPrimaryKey(YHonor record);
}