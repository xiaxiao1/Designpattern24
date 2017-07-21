package com.xiaxiao.designpattern24.abstractfactory.human;

import com.xiaxiao.designpattern24.abstractfactory.human.Human;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public abstract class WhiteHuman implements Human {
    @Override
    public void cry() {
        DPUtil.print("白人哭");
    }

    @Override
    public void laugh() {
        DPUtil.print("白人笑");
    }

    @Override
    public void talk() {
        DPUtil.print("白人说话");
    }
}
