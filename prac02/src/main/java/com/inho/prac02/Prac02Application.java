package com.inho.prac02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 시간 자동 변경!
@SpringBootApplication
public class Prac02Application {

	public static void main(String[] args) {

		SpringApplication.run(Prac02Application.class, args);

	}
}
