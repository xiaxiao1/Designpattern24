package com.xiaxiao.designpattern24.builder;

import com.xiaxiao.designpattern24.builder.interfaces.CarModel;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/24.
 */

public class KartCar extends CarModel {
    @Override
    public void start() {
        DPUtil.print("卡丁车发车咯");
    }

    @Override
    public void stop() {
        DPUtil.print("卡丁车停下了");
    }

    @Override
    public void alarm() {
        DPUtil.print("卡丁车按喇叭，嘭嘭嘭···");
    }
}
