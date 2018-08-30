package com.example.demo.dao.mybatis;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by kx on 17/4/2.
 */
@Configuration
//必须在MyBatisConfig注册后再加载MapperScannerConfigurer，否则会报错
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    mapperScannerConfigurer.setBasePackage("com.example.demo.mapper");

    //初始化扫描器的相关配置，这里我们要创建一个Mapper的父类
    Properties properties = new Properties();
    properties.setProperty("mappers", "com.example.demo.dao.mybatis.baseDao.MyMapper");
    properties.setProperty("notEmpty", "false");
    properties.setProperty("IDENTITY", "MYSQL");

    mapperScannerConfigurer.setProperties(properties);

    return mapperScannerConfigurer;
    }
}
