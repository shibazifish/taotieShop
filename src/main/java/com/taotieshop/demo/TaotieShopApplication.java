package com.taotieshop.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.taotieshop.demo.dao")
public class TaotieShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotieShopApplication.class, args);
	}
}
