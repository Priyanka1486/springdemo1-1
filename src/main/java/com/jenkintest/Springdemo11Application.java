package com.jenkintest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springdemo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo11Application.class, args);
		HelloWorld.msg();
	}
}
