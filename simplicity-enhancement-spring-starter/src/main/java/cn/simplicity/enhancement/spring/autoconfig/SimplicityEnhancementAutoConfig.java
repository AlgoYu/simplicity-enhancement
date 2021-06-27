package cn.simplicity.enhancement.spring.autoconfig;

import cn.simplicity.enhancement.spring.advice.ExceptionAdvice;
import cn.simplicity.enhancement.spring.advice.ResponseAdvice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author XiaoYu
 * @Description 自动配置类
 * @Date 2021/6/27 7:17 下午
 * @Email 794763733@qq.com
 */
@Configuration
public class SimplicityEnhancementAutoConfig {
    @Bean
    public ExceptionAdvice exceptionAdvice() {
        return new ExceptionAdvice();
    }

    @Bean
    public ResponseAdvice responseAdvice() {
        return new ResponseAdvice();
    }
}
