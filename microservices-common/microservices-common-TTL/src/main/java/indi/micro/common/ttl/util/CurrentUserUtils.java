package indi.micro.common.ttl.util;

import indi.micro.common.constant.SecurityConstants;
import indi.micro.common.constant.TokenConstants;
import indi.micro.common.domain.system.SysUser;
import indi.micro.common.utils.ServletUtils;
import indi.micro.common.utils.StringUtils;
import indi.micro.common.ttl.context.UserContextHolder;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author: yuluo
 * @date: 2023/5/22 18:09
 * @description: CurrentUserUtils
 */

public class CurrentUserUtils {

	/**
	 * 获取用户ID
	 */
	public static Long getUserId() {

		return UserContextHolder.getUserId();
	}

	/**
	 * 获取用户名称
	 */
	public static String getUsername() {

		return UserContextHolder.getUserName();
	}

	/**
	 * 获取用户key
	 */
	public static String getUserKey() {
		return UserContextHolder.getUserKey();
	}

	/**
	 * 获取登录用户信息
	 */
	public static SysUser getLoginUser() {
		return UserContextHolder.get(SecurityConstants.LOGIN_USER, SysUser.class);
	}

	/**
	 * 获取请求token
	 */
	public static String getToken() {
		return getToken(ServletUtils.getRequest());
	}

	/**
	 * 根据request获取请求token
	 */
	public static String getToken(HttpServletRequest request) {
		// 从header获取token标识
		String token = request.getHeader(TokenConstants.AUTHENTICATION);
		return replaceTokenPrefix(token);
	}

	/**
	 * 裁剪token前缀
	 */
	public static String replaceTokenPrefix(String token) {
		// 如果前端设置了令牌前缀，则裁剪掉前缀
		if (StringUtils.isNotEmpty(token) && token.startsWith(TokenConstants.PREFIX)) {
			token = token.replaceFirst(TokenConstants.PREFIX, "");
		}
		return token;
	}

}
