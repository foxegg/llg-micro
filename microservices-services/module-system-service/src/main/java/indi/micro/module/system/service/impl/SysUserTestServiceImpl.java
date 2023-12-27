package indi.micro.module.system.service.impl;

import indi.micro.module.system.service.SysUserTestService;

import org.springframework.stereotype.Service;

/**
 * @author: micro
 * @date: 2023/5/15 20:55
 * @description: some desc
 */

@Service
public class SysUserTestServiceImpl implements SysUserTestService {

	@Override
	public String testUser() {
		return "test-user-micro";
	}
}
