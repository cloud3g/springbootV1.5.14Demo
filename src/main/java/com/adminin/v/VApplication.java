package com.adminin.v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class VApplication extends ServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(VApplication.class, args);
	}
}