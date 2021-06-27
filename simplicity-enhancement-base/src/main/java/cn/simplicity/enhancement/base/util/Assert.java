package cn.simplicity.enhancement.base.util;


import cn.simplicity.enhancement.base.model.ConditionException;

/**
 * @Author XiaoYu
 * @Description 断言工具类
 * @Date 2021/6/4 1:36 下午
 * @Email 794763733@qq.com
 */
public class Assert {
    // 默认值
    private static final String FAIL_CODE = "FAIL";

    /**
     * @Author XiaoYu
     * @Description 条件不正确则抛异常，并自定义CODE和MSG。
     * @Datetime 2021/6/4 4:52 下午
     * @Param [bool, code, msg]
     * @Return void
     **/
    public static void isTrue(boolean bool, String code, String msg) {
        if (!bool) {
            throw new ConditionException(code, msg);
        }
    }

    /**
     * @Author XiaoYu
     * @Description 条件不正确则抛异常，并自定义MSG。
     * @Datetime 2021/6/4 4:54 下午
     * @Param [bool, msg]
     * @Return void
     **/
    public static void isTrue(boolean bool, String msg) {
        if (!bool) {
            throw new ConditionException(FAIL_CODE, msg);
        }
    }

    /**
     * @Author XiaoYu
     * @Description 对象为空则抛异常，并自定义CODE和MSG。
     * @Datetime 2021/6/4 4:57 下午
     * @Param [object, code, msg]
     * @Return void
     **/
    public static void isNotNull(Object object, String code, String msg) {
        if (object == null) {
            throw new ConditionException(code, msg);
        }
    }

    /**
     * @Author XiaoYu
     * @Description 对象为空则抛异常，并自定义MSG。
     * @Datetime 2021/6/4 5:00 下午
     * @Param [object, msg]
     * @Return void
     **/
    public static void isNotNull(Object object, String msg) {
        if (object == null) {
            throw new ConditionException(FAIL_CODE, msg);
        }
    }
}
