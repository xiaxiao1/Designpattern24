package com.xiaxiao.designpattern24.visitor;

/**
 * Created by xiaxiao on 2017/7/31.
 */

public abstract class SourceData {
    protected   String name;
    protected  String phone;
    protected int age;

    public abstract String getInfo();

    public abstract void accept(IVisitor iVisitor);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
