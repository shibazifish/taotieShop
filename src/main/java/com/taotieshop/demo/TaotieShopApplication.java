package com.taotieshop.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.taotieshop.demo.dao")
@EnableTransactionManagement //事务
@EnableScheduling //定时器
public class TaotieShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotieShopApplication.class, args);
	}
}
