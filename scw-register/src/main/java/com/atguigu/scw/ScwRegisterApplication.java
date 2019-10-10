package com.atguigu.scw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ScwRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScwRegisterApplication.class, args);
		System.out.println();
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);

	}

}
