package com.xiaxiao.designpattern24.visitor;

/**
 * Created by xiaxiao on 2017/7/31.
 */

public class StudentData extends SourceData {

    public StudentData(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    @Override
    public String getInfo() {
        return "name: " + getAge() +
                "phone: " + getPhone() +
                "age: " + getAge();
    }


    /*
    * 访问者模式是面向对象的，不是接口，这也是他的缺点，，依赖于具体的实现对象类
    * */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);

    }
}
