package com.xiaxiao.designpattern24.abstractfactory.human;

import com.xiaxiao.designpattern24.abstractfactory.human.Human;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public abstract class YelloHuman implements Human {
    @Override
    public void cry() {
        DPUtil.print("黄人哭");
    }

    @Override
    public void laugh() {
        DPUtil.print("黄人笑");
    }

    @Override
    public void talk() {
        DPUtil.print("黄人说话");
    }
}
