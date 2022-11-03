package com.propfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.propfile"))
public class DemoPropApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPropApplication.class, args);
	}

}
