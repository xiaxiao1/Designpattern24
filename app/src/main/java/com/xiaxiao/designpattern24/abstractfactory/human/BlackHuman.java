package com.xiaxiao.designpattern24.abstractfactory.human;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public abstract class BlackHuman implements Human {
    @Override
    public void cry() {
        DPUtil.print("黑人哭");
    }

    @Override
    public void laugh() {
        DPUtil.print("黑人笑");
    }

    @Override
    public void talk() {
        DPUtil.print("黑人说话");
    }
}
