package com.bettorleague.football;

import com.bettorleague.microservice.common.CommonMicroservice;
import com.bettorleague.microservice.mongo.MongoMicroservice;
import com.bettorleague.microservice.swagger.SwaggerMicroservice;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MongoMicroservice
@CommonMicroservice
@SwaggerMicroservice
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Football API", version = "1.0", description = "Documentation Football API v1.0"))
public class FootballServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FootballServiceApplication.class, args);
	}
}
