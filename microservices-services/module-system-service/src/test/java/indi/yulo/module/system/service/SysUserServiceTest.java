package indi.yulo.module.system.service;

import indi.micro.common.domain.system.SysUser;
import indi.micro.module.system.service.SysUserService;
import indi.micro.module.system.service.impl.SysUserServiceImpl;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: micro
 * @date: 2023/5/22 21:27
 * @description: some desc
 */

@SpringBootTest(classes = SysUserServiceImpl.class)
public class SysUserServiceTest {

	@Resource
	private SysUserService userService;

	@Test
	void testGetUserInfoByUsername() {
		String username = "micro";
		SysUser userInfoByUsername = userService.getUserInfoByUsername(username);
		System.out.println(userInfoByUsername);
	}

}
