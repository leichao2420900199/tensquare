package com.tensquare.common.entity;


import java.util.List;

/**
 * @Description //分页返回对象
 * @Author leichao
 * @Date 2019/9/20
 * @Version 1.0
 **/
public class PageResult<T> {

    /**
     * 总条数
     */
    private Long total;
    /**
     * 返回的数据
     */
    private List<T> rows;

    public PageResult() {}

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
