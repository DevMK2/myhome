package com.mklee.myhomebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MyhomeBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyhomeBatchApplication.class, args);
	}

}
