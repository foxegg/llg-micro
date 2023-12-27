package indi.micro.visual;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: micro
 * @date: 2023/5/24 13:58
 * @description: MicroServiceVisual
 */

@EnableAdminServer
@SpringBootApplication
public class MicroServiceVisualApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServiceVisualApplication.class);
		System.out.println("admin 监控启动……");
	}

}
