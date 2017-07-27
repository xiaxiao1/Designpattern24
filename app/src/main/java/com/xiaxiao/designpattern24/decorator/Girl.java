package com.xiaxiao.designpattern24.decorator;

import com.xiaxiao.designpattern24.decorator.interfaces.Person;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public class Girl extends Person {
    public Girl(String name) {
        super(name);
    }

    @Override
    public void showHair() {
        printMes(getName()+" 的 头发很漂亮");
    }
}
