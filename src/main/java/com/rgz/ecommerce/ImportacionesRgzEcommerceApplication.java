package com.rgz.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ImportacionesRgzEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportacionesRgzEcommerceApplication.class, args);
	}

}
