package com.xiaxiao.designpattern24.templatemethod;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/20.
 */

public class Benz extends AbstractCar {
    @Override
    public void start() {
        DPUtil.print("奔驰启动了");
    }

    @Override
    public void stop() {
        DPUtil.print("奔驰停住了");
    }

    @Override
    public void alarm() {
        DPUtil.print("奔驰响喇叭了");
    }
}
