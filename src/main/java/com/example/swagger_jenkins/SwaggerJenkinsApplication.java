package com.example.swagger_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) DB없이 쓸 때
public class SwaggerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerJenkinsApplication.class, args);
	}

}
