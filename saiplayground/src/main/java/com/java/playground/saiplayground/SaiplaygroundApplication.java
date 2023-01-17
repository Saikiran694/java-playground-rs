package com.java.playground.saiplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class SaiplaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaiplaygroundApplication.class, args);
	}

}
