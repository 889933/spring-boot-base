package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopWxappPage;
import com.example.mybatis.generator.entity.YoshopWxappPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopWxappPageMapper {
    long countByExample(YoshopWxappPageExample example);

    int deleteByExample(YoshopWxappPageExample example);

    int deleteByPrimaryKey(Integer pageId);

    int insert(YoshopWxappPage record);

    int insertSelective(YoshopWxappPage record);

    List<YoshopWxappPage> selectByExampleWithBLOBs(YoshopWxappPageExample example);

    List<YoshopWxappPage> selectByExample(YoshopWxappPageExample example);

    YoshopWxappPage selectByPrimaryKey(Integer pageId);

    int updateByExampleSelective(@Param("record") YoshopWxappPage record, @Param("example") YoshopWxappPageExample example);

    int updateByExampleWithBLOBs(@Param("record") YoshopWxappPage record, @Param("example") YoshopWxappPageExample example);

    int updateByExample(@Param("record") YoshopWxappPage record, @Param("example") YoshopWxappPageExample example);

    int updateByPrimaryKeySelective(YoshopWxappPage record);

    int updateByPrimaryKeyWithBLOBs(YoshopWxappPage record);

    int updateByPrimaryKey(YoshopWxappPage record);
}