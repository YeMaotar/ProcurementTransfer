package com.protransfer.procurementtransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ProcurementTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcurementTransferApplication.class, args);
	}

}
