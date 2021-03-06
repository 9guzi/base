package com.base.api.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 资料授权注解
 * 接口必须登录才可以访问 适用于类
 * @author xiaohaizi
 * @date   2017年3月10日 上午9:23:33
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ResourceAuthAnnotation {

}
