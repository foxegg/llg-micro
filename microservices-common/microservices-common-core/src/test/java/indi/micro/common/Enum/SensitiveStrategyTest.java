package indi.micro.common.Enum;

import org.junit.jupiter.api.Test;

/**
 * @author: micro
 * @date: 2023/5/25 10:37
 * @description: some desc
 */

public class SensitiveStrategyTest {

	@Test
	void testEmailSensitive() {

		String email = "780879337@qq.com";
		String email1 = "micro829@aliyun.com";

		System.out.println(email1.replaceAll("(\\S{3})\\S{2}(\\S*)", "$1****$2"));

	}

}
