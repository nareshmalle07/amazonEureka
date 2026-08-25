package com.amazon.amazonEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmazonEurekaApplication {

	public static void main(String[] args) {

		System.out.println("AmazonEurekaApplication started");
		SpringApplication.run(AmazonEurekaApplication.class, args);
		System.out.println("AmazonEurekaApplication ended");
	}

}
