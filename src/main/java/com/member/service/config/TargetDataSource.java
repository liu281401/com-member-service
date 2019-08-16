package com.member.service.config;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface TargetDataSource {
    //数据源名称
    String value() default "";
}
