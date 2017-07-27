package com.xiaxiao.designpattern24.decorator.interfaces;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public  abstract class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public abstract void showHair();

    public void printMes(String mes) {
        System.out.println(mes);
    }

}
