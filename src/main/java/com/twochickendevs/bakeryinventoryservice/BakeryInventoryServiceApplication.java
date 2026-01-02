package com.twochickendevs.bakeryinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.twochickendevs"})
@EnableTransactionManagement
@EnableFeignClients(basePackages = {"com.twochickendevs"})
public class BakeryInventoryServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(BakeryInventoryServiceApplication.class, args);
	}
}
