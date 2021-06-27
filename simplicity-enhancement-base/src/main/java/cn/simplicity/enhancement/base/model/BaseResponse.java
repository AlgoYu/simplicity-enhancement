package cn.simplicity.enhancement.base.model;

import lombok.Data;

/**
 * @ClassName: HttpResponse
 * @Description: API接口统一返回类
 * @Author XiaoYu
 * @Datetime 2021/5/30 9:30 下午
 */
@Data
public class BaseResponse<T> {
    // 成功代码
    private String code;
    // 信息
    private String msg;
    // 数据
    private T data;

    public BaseResponse(String code, String msg) {
        this(code, msg, null);
    }

    public BaseResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 成功
    public static final BaseResponse<Object> SUCCESS = new BaseResponse<>("SUCCESS", null);
    // 失败
    public static final BaseResponse<Object> FAIL = new BaseResponse<>("FAIL", null);
    // 服务器忙
    public static final BaseResponse<Object> SERVER_BUSY = new BaseResponse<>("FAIL", null);

    /**
     * @Author XiaoYu
     * @Description 是否成功
     * @Datetime 2021/5/30 10:01 下午
     * @Param []
     * @Return java.lang.Boolean
     **/
    public Boolean isSuccess() {
        return "SUCCESS".equals(code);
    }

    /**
     * @Author XiaoYu
     * @Description 构建成功数据对象
     * @Datetime 2021/5/30 11:36 下午
     * @Param [object]
     * @Return cn.algorithm.www.model.BaseResponse<java.lang.Object>
     **/
    public static BaseResponse<Object> success(Object object) {
        return new BaseResponse<>("SUCCESS", null, object);
    }

    /**
     * @Author XiaoYu
     * @Description 构建失败数据对象
     * @Datetime 2021/5/30 11:36 下午
     * @Param [object]
     * @Return cn.algorithm.www.model.BaseResponse<java.lang.Object>
     **/
    public static BaseResponse<Object> fail(String msg) {
        return new BaseResponse<>("FAIL", msg);
    }
}
