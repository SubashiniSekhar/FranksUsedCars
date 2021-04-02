package com.franks.carshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.franks.carshop.cars.CarController;


@SpringBootApplication
@ComponentScan(basePackageClasses=CarController.class)
public class CarshopApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CarshopApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CarshopApplication.class);
	}
	
	
//	@Bean
//	public CorsFilter corsFilter(){
//
//	    CorsConfiguration corsConfiguration = new CorsConfiguration();
//	    corsConfiguration.setAllowCredentials(true);
//	    corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//	    corsConfiguration.setAllowedHeaders(Arrays.asList("Access-Control-Allow-Headers","Access-Control-Allow-Origin","X-Requested-With",
//	            "origin, content-type, accept, authorization"));
//	    
//	}

}
