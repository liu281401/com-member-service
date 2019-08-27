package com.member.service.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Classname: DynamicDataSource
 * @Description: TODO
 * @Date: 2019-08-12 17:45
 * @Author: Yu.Liu
 **/
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        // 直接从ThreadLocal中获取拿到的数据源
        logger.info("DynamicDataSource.determineCurrentLookupKey curr data source 111:" + DynamicDataSourceHolder.getDataSource());
        return DynamicDataSourceHolder.getDataSource();
    }
}
