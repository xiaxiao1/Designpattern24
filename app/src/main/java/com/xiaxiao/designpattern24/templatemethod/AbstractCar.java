package com.xiaxiao.designpattern24.templatemethod;

/**
 * Created by xiaxiao on 2017/7/20.
 * 由于模版方式模式的特性  所以这应该是一个抽象类，而不是一个接口
 */

public abstract class AbstractCar {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    //模版方法的核心
    public void run(){
        this.start();
        this.alarm();
        this.stop();
    }
}
