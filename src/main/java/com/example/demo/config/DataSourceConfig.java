package com.example.demo.config;

import com.example.demo.DemoApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = DemoApplication.class)
public class DataSourceConfig {
}
