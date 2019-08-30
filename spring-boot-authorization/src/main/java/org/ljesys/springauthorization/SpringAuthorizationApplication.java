package org.ljesys.springauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationApplication.class, args);
	}

}
