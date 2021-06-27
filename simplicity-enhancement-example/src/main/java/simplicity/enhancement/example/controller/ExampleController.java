package simplicity.enhancement.example.controller;

import cn.simplicity.enhancement.spring.annotation.API;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simplicity.enhancement.example.model.Test;

/**
 * @Author XiaoYu
 * @Description TODO
 * @Date 2021/6/27 2:02 下午
 * @Email 794763733@qq.com
 */
@RestController
public class ExampleController {

    @API
    @GetMapping(value = "/testExample1")
    public Test testExample1(@RequestParam(value = "str") String str) {
        Test test = new Test();
        test.setAge(1);
        test.setName("xiaoyu");
        return test;
    }

    @GetMapping(value = "/testExample")
    public String testExample2(@RequestParam(value = "str") String str) {
        return str;
    }
}
