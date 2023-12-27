package indi.micro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: micro
 * @date: 2023/5/15 16:25
 * @description: micro microservices gateway application
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServicesGatewayApplication.class, args);
		System.out.println(" 网关模块启动成功 …… ");
	}

}
