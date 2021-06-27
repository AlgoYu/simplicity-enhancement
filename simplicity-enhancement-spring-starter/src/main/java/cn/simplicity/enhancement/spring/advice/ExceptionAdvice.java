package cn.simplicity.enhancement.spring.advice;

import cn.simplicity.enhancement.base.model.BaseResponse;
import cn.simplicity.enhancement.base.model.ConditionException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author XiaoYu
 * @Description 异常处理
 * @Date 2021/6/4 1:31 下午
 * @Email 794763733@qq.com
 */
@ControllerAdvice
@Slf4j
@ConditionalOnWebApplication
public class ExceptionAdvice {
    /**
     * @Author XiaoYu
     * @Description 对接口的报错异常进行处理
     * @Datetime 2021/6/4 1:33 下午
     * @Param []
     * @Return java.lang.Object
     **/
    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(HttpServletRequest req, Exception e) {

        if (e instanceof ConditionException) {
            ConditionException exception = (ConditionException) e;
            return new BaseResponse<>(exception.getCode(), exception.getMsg(), null);
        }
        return BaseResponse.FAIL;
    }
}
