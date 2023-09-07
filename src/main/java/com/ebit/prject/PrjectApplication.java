package com.ebit.prject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User API", version = "1.0", description = "User Information"))
public class PrjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrjectApplication.class, args);
	}

}
