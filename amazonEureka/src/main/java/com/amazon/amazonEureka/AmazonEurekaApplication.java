package com.amazon.amazonEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonEurekaApplication {

	public static void main(String[] args) {

		System.out.println("AmazonEurekaApplication started");
		SpringApplication.run(AmazonEurekaApplication.class, args);
		System.out.println("AmazonEurekaApplication ended");
	}

}
