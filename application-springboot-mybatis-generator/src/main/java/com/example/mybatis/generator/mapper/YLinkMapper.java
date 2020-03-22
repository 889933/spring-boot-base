package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YLink;
import com.example.mybatis.generator.entity.YLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YLinkMapper {
    long countByExample(YLinkExample example);

    int deleteByExample(YLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YLink record);

    int insertSelective(YLink record);

    List<YLink> selectByExample(YLinkExample example);

    YLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YLink record, @Param("example") YLinkExample example);

    int updateByExample(@Param("record") YLink record, @Param("example") YLinkExample example);

    int updateByPrimaryKeySelective(YLink record);

    int updateByPrimaryKey(YLink record);
}