package com.ab.springvote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author young
 */
@SpringBootApplication
@MapperScan({"com.ab.springvote.dao"})
public class SpringvoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringvoteApplication.class, args);
    }

}
