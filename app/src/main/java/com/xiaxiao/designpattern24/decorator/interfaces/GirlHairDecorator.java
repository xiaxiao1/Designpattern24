package com.xiaxiao.designpattern24.decorator.interfaces;

import com.xiaxiao.designpattern24.decorator.interfaces.Person;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public abstract  class GirlHairDecorator extends Person {
    protected Person girl;

    public GirlHairDecorator(Person girl) {
        this.girl = girl;
        this.name = girl.name;
    }

    @Override
    public void showHair() {
        girl.showHair();
    }
}
