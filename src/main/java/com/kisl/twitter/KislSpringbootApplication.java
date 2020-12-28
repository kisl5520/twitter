package com.kisl.twitter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author keyan.
 */
@SpringBootApplication
@MapperScan("com.kisl.twitter.mapper")
public class KislSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KislSpringbootApplication.class, args);
    }
}

