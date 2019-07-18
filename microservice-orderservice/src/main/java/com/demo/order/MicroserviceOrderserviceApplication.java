package com.demo.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.demo.order.repository")
@EnableTransactionManagement
public class MicroserviceOrderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrderserviceApplication.class, args);
    }

}
