package org.example.pagehelper.pojo;

import javax.swing.plaf.SeparatorUI;
import java.util.List;

/**
 * @author mingzhihong
 * @date 2019/9/23 19:57
 */
public class Page<E> {
    private int pageNum;
    private int pageSize;
    private int totalPage;
    private int totalRecord;
    //当前页所有数据
    private List<E> list;
    public Page() {
    }

    public Page(int pageNum, int pageSize, int pages, int total, List<E> list) {
        super();
        this.pageNum = pageNum;
        this.pageNum= pageSize;
        this.totalPage= pages;
        this.totalRecord = total;
        this.list =list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }
}
