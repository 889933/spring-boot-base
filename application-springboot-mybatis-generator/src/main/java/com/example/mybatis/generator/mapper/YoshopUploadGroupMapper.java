package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopUploadGroup;
import com.example.mybatis.generator.entity.YoshopUploadGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopUploadGroupMapper {
    long countByExample(YoshopUploadGroupExample example);

    int deleteByExample(YoshopUploadGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(YoshopUploadGroup record);

    int insertSelective(YoshopUploadGroup record);

    List<YoshopUploadGroup> selectByExample(YoshopUploadGroupExample example);

    YoshopUploadGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") YoshopUploadGroup record, @Param("example") YoshopUploadGroupExample example);

    int updateByExample(@Param("record") YoshopUploadGroup record, @Param("example") YoshopUploadGroupExample example);

    int updateByPrimaryKeySelective(YoshopUploadGroup record);

    int updateByPrimaryKey(YoshopUploadGroup record);
}