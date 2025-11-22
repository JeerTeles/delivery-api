package com.delivery_api.Projeto.delivery.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProjetoDeliveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDeliveryApiApplication.class, args);
	}

}
