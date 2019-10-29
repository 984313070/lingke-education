package com.jk.education.user.common.model;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

    private int current;//当前页
    private int end;//尾页
    private int numPerPage;//每页记录数
    private int totalCount;//总记录数
    private List<User> userList;//当前页数据
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }
    public int getNumPerPage() {
        return numPerPage;
    }
    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.end = (int)Math.ceil(totalCount/numPerPage)+1;//计算尾页
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "current=" + current +
                ", end=" + end +
                ", numPerPage=" + numPerPage +
                ", totalCount=" + totalCount +
                ", userList=" + userList +
                '}';
    }
}
