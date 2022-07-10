package com.enki.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.enki")
public class EnkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnkiApplication.class, args);
	}

}
