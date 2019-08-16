package com.member.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = "com.member.service.*")
@MapperScan("com.member.service.dao")
public class ComMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComMemberServiceApplication.class, args);
    }

}
