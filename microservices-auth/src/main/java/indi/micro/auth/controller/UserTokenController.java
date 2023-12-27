package indi.micro.auth.controller;

import java.util.HashMap;

import indi.micro.auth.form.EmailLoginBody;
import indi.micro.auth.form.LoginBody;
import indi.micro.auth.form.RegisterBody;
import indi.micro.auth.module.CurrentUser;
import indi.micro.auth.service.SysUserLoginService;
import indi.micro.common.result.Result;
import indi.micro.common.utils.JwtUtils;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: micro
 * @date: 2023/5/19 21:13
 * @description: 用户 Token 控制器
 */

@Slf4j
@RestController
@RequestMapping("/auth")
public class UserTokenController {

	@Resource
	private SysUserLoginService sysUserLoginService;

	@GetMapping("/test")
	public Result<?> test() {
		return Result.success("test");
	}

	/**
	 * 登录方法
	 * @param loginBody 登录信息实体
	 * @return token
	 */
	@PostMapping("/login")
	public Result<String> login(@Valid @RequestBody LoginBody loginBody) {

		CurrentUser currentUser = sysUserLoginService.login(loginBody.getUsername(), loginBody.getPassword());

		HashMap<String, Object> claim = new HashMap<>();
		claim.put("username", currentUser.getUsername());
		claim.put("userid", currentUser.getUserId());
		claim.put("userRoles", currentUser.getRoles());

		String token = JwtUtils.generateToken(claim, currentUser);

		return Result.success(token);
	}

	/**
	 * 邮箱登录功能
	 * @return token
	 */
	@PostMapping("/emailLogin")
	public Result<String> emailLogin(@RequestBody EmailLoginBody loginBody) {

		return Result.success();
	}


	/**
	 * 用户注册
	 */
	@PostMapping("/register")
	public Result<Void> register(@RequestBody RegisterBody registerBody) {

		// 用户注册
		sysUserLoginService.register(registerBody.getUsername(), registerBody.getPassword());

		return Result.success();
	}

	/**
	 * 登出方法
	 */
	@DeleteMapping("/logout")
	public Result<Void> logout(HttpServletRequest request) {

		sysUserLoginService.logout(request);
		return Result.success();
	}

}
