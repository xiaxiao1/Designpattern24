package com.xiaxiao.designpattern24.strategy;

import com.xiaxiao.designpattern24.strategy.interfaces.IStrategy;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/22.
 */

public class HumorStrategy implements IStrategy {
    @Override
    public void execute() {
        DPUtil.print("让自己幽默，哄她开心，她就喜欢你了。");
    }
}
