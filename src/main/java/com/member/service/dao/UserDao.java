package com.member.service.dao;

import com.member.service.config.TargetDataSource;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: UserDao
 * @Description: TODO
 * @Date: 2019-07-30 17:45
 * @Author: Yu.Liu
 **/
public interface UserDao {
    @TargetDataSource("firstAopDataSource")
    void insert1(@Param("id") String id);
    @TargetDataSource("secondAopDataSource")
    void insert2(@Param("id") String id);
}
