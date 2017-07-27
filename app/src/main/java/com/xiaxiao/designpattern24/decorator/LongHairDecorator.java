package com.xiaxiao.designpattern24.decorator;

import com.xiaxiao.designpattern24.decorator.interfaces.GirlHairDecorator;
import com.xiaxiao.designpattern24.decorator.interfaces.Person;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public class LongHairDecorator extends GirlHairDecorator {
    public LongHairDecorator(Person person) {
        super(person);
    }

    public void showLong() {
        printMes(getName()+"我的头发是很长很长的哦");
    }
    @Override
    public void showHair() {
        showLong();
        super.showHair();
    }
}
