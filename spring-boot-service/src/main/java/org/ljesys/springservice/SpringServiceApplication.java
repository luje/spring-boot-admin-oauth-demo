package org.ljesys.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceApplication.class, args);
	}

}
