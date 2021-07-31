package com.springboot.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket swaggerconfiguration() {
		// Return a prepared Docker Instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.apis(RequestHandlerSelectors.basePackage("com.springboot.swagger"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Employee Details API",
				"Sample API for swagger tutorial", 
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Aniket Katkar", "https://www.linkedin.com/in/aniketkatkar/", "aniketkatkar73@gmail.com"),
				"API License",
				"https://github.com/aniketkatkar-git",
				Collections.emptyList());
	}
}