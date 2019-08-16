package com.member.service.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname: DataSourceConfig
 * @Description: TODO
 * @Date: 2019-08-12 17:36
 * @Author: Yu.Liu
 **/
@Configuration
@Slf4j
public class DataSourceConfig {

    /**
     * first数据源
     * @return
     */
    @Bean(name = "firstAopDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource firstDataSource() {
        return new DruidDataSource();
    }

    /**
     * second数据源
     * @return
     */
    @Bean(name = "secondAopDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource secondDataSource() {
        return  new DruidDataSource();
    }

    /**
     * 获取动态数据源
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 设置默认数据源为first数据源
        dynamicDataSource.setDefaultTargetDataSource(firstDataSource());
        // 配置多数据源,
        // 添加数据源标识和DataSource引用到目标源映射
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put("firstAopDataSource", firstDataSource());
        dataSourceMap.put("secondAopDataSource", secondDataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }

}
