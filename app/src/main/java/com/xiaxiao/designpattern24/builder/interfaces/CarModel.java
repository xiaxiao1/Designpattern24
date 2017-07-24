package com.xiaxiao.designpattern24.builder.interfaces;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/24.
 *
 * 创建不同执行顺序的车，所以这里是方法的执行顺序 ，导致最后的结果不一样
 */

public abstract class CarModel {

    public static final String START = "start";
    public static final String STOP= "stop";
    public static final String ALARM = "alarm";
    protected ArrayList<String> order ;
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();

    public void setOrder(ArrayList<String> list) {
        this.order= new ArrayList<>(list);
    }
    public void run() {
        for (String s:order) {
            if (s.equals(this.START)) {
                start();
            }
            if (s.equals(this.STOP)) {
                stop();
            }
            if (s.equals(this.ALARM)) {
                alarm();
            }
        }
    }
}
