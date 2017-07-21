package com.xiaxiao.designpattern24.templatemethod;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/20.
 */

public class Hummer extends AbstractCar {
    @Override
    public void start() {
        DPUtil.print("悍马启动了");
    }

    @Override
    public void stop() {
        DPUtil.print("悍马停住了");
    }

    @Override
    public void alarm() {
        DPUtil.print("悍马响喇叭了");
    }
}
