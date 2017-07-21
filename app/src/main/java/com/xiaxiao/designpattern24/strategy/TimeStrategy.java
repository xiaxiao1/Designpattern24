package com.xiaxiao.designpattern24.strategy;

import com.xiaxiao.designpattern24.strategy.interfaces.IStrategy;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/22.
 */

public class TimeStrategy implements IStrategy {
    @Override
    public void execute() {
        DPUtil.print("多花时间陪她，增进感情");
    }
}
