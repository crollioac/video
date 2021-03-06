package com.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class InterviddInterviewApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InterviddInterviewApplication.class, args);
	}
}
