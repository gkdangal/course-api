package com.example.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		
		System.out.println("#############Started###############");
		SpringApplication.run(CourseApiApplication.class, args);
		
		System.out.println("#############success###############");
	}
}
