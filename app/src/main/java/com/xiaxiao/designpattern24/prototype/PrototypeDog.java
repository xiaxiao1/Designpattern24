package com.xiaxiao.designpattern24.prototype;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/1.
 */

public class PrototypeDog implements Cloneable{
    String  name;
    String  owner;
    int age;

    public PrototypeDog() {
        DPUtil.print("构造函数， 产生了一条小狗狗");
    }

    @Override
    public PrototypeDog clone()  {
        PrototypeDog dog=null;
        try {
            dog=(PrototypeDog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  dog;
    }

    public void printInfo() {
        DPUtil.print(this.toString());
    }

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PrototypeDog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
