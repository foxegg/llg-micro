package indi.micro.auth.test.mapper;

import indi.micro.auth.mapper.SysCurrentUserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: micro
 * @date: 2023/5/20 18:09
 * @description: some desc
 */

@SpringBootTest
public class SysCurrentUserMapperTest {

	@Resource
	private SysCurrentUserMapper sysCurrentUserMapper;

	@Test
	void testSelectOne() {
	}

}
