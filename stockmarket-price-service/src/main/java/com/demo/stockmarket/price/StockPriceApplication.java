package com.demo.stockmarket.price;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.demo.stockmarket.price.config.FileStorageProperties;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.demo.stockmarket.entity")
@EnableConfigurationProperties({ FileStorageProperties.class })
public class StockPriceApplication {
	
	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(StockPriceApplication.class, args);
	}
}
