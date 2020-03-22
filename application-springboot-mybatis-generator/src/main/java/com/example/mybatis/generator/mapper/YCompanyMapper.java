package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YCompany;
import com.example.mybatis.generator.entity.YCompanyExample;
import com.example.mybatis.generator.entity.YCompanyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCompanyMapper {
    long countByExample(YCompanyExample example);

    int deleteByExample(YCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YCompanyWithBLOBs record);

    int insertSelective(YCompanyWithBLOBs record);

    List<YCompanyWithBLOBs> selectByExampleWithBLOBs(YCompanyExample example);

    List<YCompany> selectByExample(YCompanyExample example);

    YCompanyWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YCompanyWithBLOBs record, @Param("example") YCompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") YCompanyWithBLOBs record, @Param("example") YCompanyExample example);

    int updateByExample(@Param("record") YCompany record, @Param("example") YCompanyExample example);

    int updateByPrimaryKeySelective(YCompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(YCompanyWithBLOBs record);

    int updateByPrimaryKey(YCompany record);
}