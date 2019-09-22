package com.dx.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
/**
 * eureka server 服务器端启动类，接受其他服务注册进来
 */
@EnableEurekaServer
public class EurekaServerTest {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTest.class, args);
	}

}
