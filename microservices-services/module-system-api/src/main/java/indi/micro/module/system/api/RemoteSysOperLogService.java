package indi.micro.module.system.api;

import java.util.List;
import java.util.Map;

import indi.micro.common.constant.ServiceNameConstants;
import indi.micro.common.domain.system.SysOperLog;
import indi.micro.common.result.Result;
import indi.micro.module.system.api.factory.RemoteSysOperLogFallbackFactory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: micro
 * @date: 2023/5/22 16:42
 * @description: RemoteSysOperLogService
 */

@FeignClient(contextId = "remoteSysOperLogService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteSysOperLogFallbackFactory.class)
public interface RemoteSysOperLogService {

	/**
	 * 获取系统日志
	 * @return Map<String, List<SysOperLog>>
	 */
	@GetMapping("/operlog/getOperLog")
	Result<Map<String, List<SysOperLog>>> getOperLog();

	/**
	 * 删除系统日志
	 * @return 删除标记
	 */
	@DeleteMapping("/operlog/delOperLog")
	Result<Boolean> delOperLog();

	/**
	 * 添加系统日志
	 * @return 删除标记
	 */
	@PostMapping("/operlog/saveLog")
	Result<Boolean> saveOperLog(@RequestBody SysOperLog sysOperLog);

}
