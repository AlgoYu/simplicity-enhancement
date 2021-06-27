package simplicity.enhancement.example;

import cn.simplicity.enhancement.spring.annotation.EnableEnhancement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author XiaoYu
 * @Description 示例程序
 * @Date 2021/6/27 1:53 下午
 * @Email 794763733@qq.com
 */
@SpringBootApplication
@EnableEnhancement
public class ExampleApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ExampleApplication.class, args);
        Object exceptionAdvice = run.getBean("exceptionAdvice");
        System.out.println(exceptionAdvice);
    }
}
