package indi.micro.gateway.handler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import indi.micro.common.exception.CaptchaException;
import indi.micro.common.result.Result;
import indi.micro.gateway.service.ValidateCodeService;
import reactor.core.publisher.Mono;

/**
 * @author: micro
 * @date: 2023/5/15 19:57
 * @description: 验证码获取
 */

@Service
public class ValidateCodeHandler implements HandlerFunction<ServerResponse> {

	@Autowired
	private ValidateCodeService validateCodeService;

	@Override
	public Mono<ServerResponse> handle(ServerRequest serverRequest) {

		Result<Object> captcha;

		try {
			captcha = validateCodeService.createCaptcha();
		}
		catch (CaptchaException | IOException e) {
			return Mono.error(e);
		}
		return ServerResponse.status(HttpStatus.OK).body(BodyInserters.fromValue(captcha));
	}

}
