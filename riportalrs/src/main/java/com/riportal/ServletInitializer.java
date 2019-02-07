package com.riportal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@MapperScan("com.riportal.mapper")
@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class);
	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServletInitializer.class, args);
//	}

}
