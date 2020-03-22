package com.example.mybatis.generator.mapper;

import com.example.mybatis.generator.entity.YoshopStoreUser;
import com.example.mybatis.generator.entity.YoshopStoreUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoshopStoreUserMapper {
    long countByExample(YoshopStoreUserExample example);

    int deleteByExample(YoshopStoreUserExample example);

    int deleteByPrimaryKey(Integer storeUserId);

    int insert(YoshopStoreUser record);

    int insertSelective(YoshopStoreUser record);

    List<YoshopStoreUser> selectByExample(YoshopStoreUserExample example);

    YoshopStoreUser selectByPrimaryKey(Integer storeUserId);

    int updateByExampleSelective(@Param("record") YoshopStoreUser record, @Param("example") YoshopStoreUserExample example);

    int updateByExample(@Param("record") YoshopStoreUser record, @Param("example") YoshopStoreUserExample example);

    int updateByPrimaryKeySelective(YoshopStoreUser record);

    int updateByPrimaryKey(YoshopStoreUser record);
}