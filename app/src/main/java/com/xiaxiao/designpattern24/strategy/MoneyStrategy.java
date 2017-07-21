package com.xiaxiao.designpattern24.strategy;

import com.xiaxiao.designpattern24.strategy.interfaces.IStrategy;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/22.
 */

public class MoneyStrategy  implements IStrategy{
    @Override
    public void execute() {
        DPUtil.print("多花钱，给她买各种好东西");
    }
}
