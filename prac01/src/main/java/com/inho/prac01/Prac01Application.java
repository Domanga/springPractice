package com.inho.prac01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Prac01Application {

	public static void main(String[] args) {
		SpringApplication.run(Prac01Application.class, args);
	}

}
