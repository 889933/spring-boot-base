package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopUploadFile;
import com.example.mybatis.generator.entity.YoshopUploadFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopUploadFileMapper {
    long countByExample(YoshopUploadFileExample example);

    int deleteByExample(YoshopUploadFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(YoshopUploadFile record);

    int insertSelective(YoshopUploadFile record);

    List<YoshopUploadFile> selectByExample(YoshopUploadFileExample example);

    YoshopUploadFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") YoshopUploadFile record, @Param("example") YoshopUploadFileExample example);

    int updateByExample(@Param("record") YoshopUploadFile record, @Param("example") YoshopUploadFileExample example);

    int updateByPrimaryKeySelective(YoshopUploadFile record);

    int updateByPrimaryKey(YoshopUploadFile record);
}