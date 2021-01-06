package com.kisl.twitter.config;/**
 * Created by Administrator on 2021/1/6.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author keyan
 * @Descrition MyBatisConfig
 * @Date 2021/1/6 22:31
 * @Version 1.0.0
 */
@Configuration
@MapperScan({"com.kisl.twitter.mbg.mapper","com.kisl.twitter.dao"})
public class MyBatisConfig {
}
