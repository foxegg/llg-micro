package indi.micro.auth;


import indi.micro.common.annotation.EnableMicroFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: micro
 * @date: 2023/5/15 15:59
 * @description: micro microservice auth application
 */

@SpringBootApplication
@EnableMicroFeignClients
public class MicroServiceAuthApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServiceAuthApplication.class, args);
		System.out.println(" 认证授权中心启动成功…… ");
	}

}
