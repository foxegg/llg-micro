package indi.micro.auth.form;

import lombok.Data;

/**
 * @author: micro
 * @date: 2023/5/22 14:53
 * @description: 邮箱登录对象
 */

@Data
public class EmailLoginBody {

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 邮箱code
	 */
	private String emailCode;

}
