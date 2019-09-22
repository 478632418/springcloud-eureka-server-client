package com.dx.test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * EnableDiscoveryClient和EnableEurekaClient 效果相同   建议使用EnableDiscoveryClient
 * 本服务启动后会自动注册进eureka服务中
 */
@EnableDiscoveryClient
//@EnableEurekaClient
@MapperScan("com.rp.springcloud.dao")
public class EmpProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpProvideApplication.class, args);
    }
}