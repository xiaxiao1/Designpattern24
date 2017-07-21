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

    @Override
    public void showHair() {
        girl.showHair();
        printMes("long hair decorator done: "+girl.name+" 的头发长长的");
    }
}
