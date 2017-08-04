package com.xiaxiao.designpattern24.flyweight;

/**
 * Created by xiaxiao on 2017/8/3.
 */

/*
* 细粒度对象
* 维护对象的内部状态， 外部状态在子类SignInfo4Pool类中
*
* */
public class SignInfo {
    String id;
    String location;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
