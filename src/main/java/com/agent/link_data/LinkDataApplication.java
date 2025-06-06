package com.agent.link_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LinkDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkDataApplication.class, args);
	}

}
