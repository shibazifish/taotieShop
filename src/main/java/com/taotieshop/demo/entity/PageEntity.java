package com.taotieshop.demo.entity;

import java.util.List;

/**
 * @Auther: 李宇
 * @Date: 2018/11/10 00:13
 * @Description:
 */
public class PageEntity<T> {
    // 当前页
    private Integer currentPage = 1;
    // 每页显示的总条数
    private Integer pageSize = 10;
    // 总条数
    private Integer count;
    // 是否有下一页
    private Integer isMore;
    // 总页数
    private Integer totalPages;
    // 开始索引
    private Integer startIndex;
    // 分页结果
    private List<T> data;

    public PageEntity() {
        super();
    }

    public PageEntity(Integer currentPage, Integer totalNum) {
        super();
        this.currentPage = currentPage;
        this.count = totalNum;
        this.totalPages = (this.count+this.pageSize-1)/this.pageSize;
        this.startIndex = (this.currentPage-1)*this.pageSize;
        this.isMore = this.currentPage >= this.totalPages?0:1;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getIsMore() {
        return isMore;
    }

    public void setIsMore(Integer isMore) {
        this.isMore = isMore;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
