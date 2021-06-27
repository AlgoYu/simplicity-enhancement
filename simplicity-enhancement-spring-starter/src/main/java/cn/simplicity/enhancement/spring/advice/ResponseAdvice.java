package cn.simplicity.enhancement.spring.advice;

import cn.simplicity.enhancement.base.model.BaseResponse;
import cn.simplicity.enhancement.spring.annotation.API;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.annotation.Annotation;

/**
 * @ClassName: BaseResponseAdvice
 * @Description: 对HTTP返回值进行处理
 * @Author XiaoYu
 * @Datetime 2021/5/30 11:09 下午
 */
@RestControllerAdvice
@Slf4j
public class ResponseAdvice implements ResponseBodyAdvice<Object> {
    // API注解的类型
    private static final Class<? extends Annotation> API_ANNOTATION_TYPE = API.class;

    /**
     * @Author XiaoYu
     * @Description 判断是否有注解
     * @Datetime 2021/5/30 11:25 下午
     * @Param [returnType, converterType]
     * @Return boolean
     **/
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return returnType.hasMethodAnnotation(API_ANNOTATION_TYPE) || AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), API_ANNOTATION_TYPE);
    }

    /**
     * @Author XiaoYu
     * @Description 返回BaseResponse包装类
     * @Datetime 2021/5/30 11:31 下午
     * @Param [body, returnType, selectedContentType, selectedConverterType, request, response]
     * @Return java.lang.Object
     **/
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        // 防止重复包裹或资源文件
        if (body instanceof BaseResponse || body instanceof Resource) {
            return body;
        }
        // 若无包裹则实现
        return BaseResponse.success(body);
    }
}
