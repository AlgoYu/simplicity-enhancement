package cn.simplicity.enhancement.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author XiaoYu
 * @Description
 * @Date 2021/6/4 1:46 下午
 * @Email 794763733@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConditionException extends RuntimeException {
    // 错误代码
    private String code;
    // 错误信息
    private String msg;
}
