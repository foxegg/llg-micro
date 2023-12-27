package indi.micro.common.exception;

/**
 * @author: micro
 * @date: 2023/5/18 9:22
 * @description: 服务异常
 */

public class ServiceException extends RuntimeException {

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}
}
