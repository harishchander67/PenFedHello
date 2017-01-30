package com.penfed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableSwagger2
public class PenFedHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(PenFedHelloApplication.class, args);
	}
}
