package com.xiaxiao.designpattern24.decorator;

import com.xiaxiao.designpattern24.decorator.interfaces.GirlHairDecorator;
import com.xiaxiao.designpattern24.decorator.interfaces.Person;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public class ColorHairDecorator extends GirlHairDecorator {

    //在这里定义头发颜色好像是不对的，，应该在Girl的接口中定义吧
    private String color;

    public ColorHairDecorator(Person girl, String color) {
        super(girl);
        this.color = color;
    }

    public void showColor() {
        printMes(getName()+"我的头发的颜色是"+color);
    }

    @Override
    public void showHair() {
        this.showColor();
        super.showHair();
    }
}
