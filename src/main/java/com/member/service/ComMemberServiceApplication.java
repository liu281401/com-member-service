package com.member.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComMemberServiceApplication.class, args);
    }

}
