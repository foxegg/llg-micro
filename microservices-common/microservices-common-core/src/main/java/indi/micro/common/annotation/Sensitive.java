package indi.micro.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import indi.micro.common.Enum.SensitiveStrategy;
import indi.micro.common.config.SensitiveJsonSerializer;


/**
 * @author: yuluo
 * @date: 2023/3/27 17:48
 * @description: 脱敏注解
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JacksonAnnotationsInside
@JsonSerialize(using = SensitiveJsonSerializer.class)
public @interface Sensitive {

	//脱敏策略
	SensitiveStrategy strategy();

}
