package cn.simplicity.enhancement.base.model;

import lombok.Data;


/**
 * @Author XiaoYu
 * @Description
 * @Date 2021/6/4 1:46 下午
 * @Email 794763733@qq.com
 */
public class ConditionException extends RuntimeException {
    // 错误代码
    private String code;

    public ConditionException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
