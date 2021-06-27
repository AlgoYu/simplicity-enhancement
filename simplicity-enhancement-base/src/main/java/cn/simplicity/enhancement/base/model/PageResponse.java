package cn.simplicity.enhancement.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author XiaoYu
 * @Description 分页数据基础类
 * @Date 2021/6/4 5:04 下午
 * @Email 794763733@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse<T> {
    // 总数
    private long total;
    // 当前页
    private int page;
    // 页大小
    private int size;
    // 返回数据
    private List<T> list;
}
