package com.jk.education.shopping.common.model;

/**
 * @类名: BykArea
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-25 15:03
 **/
public class BykArea {

    private int id;

    private String name;

    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "BykArea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                '}';
    }
}