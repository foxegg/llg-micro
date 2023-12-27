package indi.micro.module.system;

import indi.micro.common.annotation.EnableMicroFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: micro
 * @date: 2023/5/15 16:28
 * @description: some desc
 */

@SpringBootApplication
@EnableMicroFeignClients
public class MicroServiceModuleSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServiceModuleSystemApplication.class, args);
		System.out.println(" 系统服务启动…… ");

	}

}
