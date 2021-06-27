package cn.simplicity.enhancement.spring.annotation;

import cn.simplicity.enhancement.spring.autoconfig.SimplicityEnhancementAutoConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author XiaoYu
 * @Description 增强功能启动注解
 * @Date 2021/6/4 12:16 下午
 * @Email 794763733@qq.com
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Import(value = SimplicityEnhancementAutoConfig.class)
public @interface EnableEnhancement {
    // 返回值包装启用
    boolean response() default true;

    // 异常包装启动
    boolean exception() default true;
}
