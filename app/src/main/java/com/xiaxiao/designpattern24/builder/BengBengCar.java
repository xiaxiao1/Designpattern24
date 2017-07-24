package com.xiaxiao.designpattern24.builder;

import com.xiaxiao.designpattern24.builder.interfaces.CarModel;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/24.
 */

public class BengBengCar extends CarModel {
    @Override
    public void start() {
        DPUtil.print("蹦蹦车发车咯");
    }

    @Override
    public void stop() {
        DPUtil.print("蹦蹦车停下了");
    }

    @Override
    public void alarm() {
        DPUtil.print("蹦蹦车按喇叭，嘟嘟嘟···");
    }
}
