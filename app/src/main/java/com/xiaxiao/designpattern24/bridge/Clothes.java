package com.xiaxiao.designpattern24.bridge;

import com.xiaxiao.designpattern24.bridge.interfaces.Product;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/25.
 */

public class Clothes extends Product {
    @Override
    public void beProduced() {
        DPUtil.print("衣服做好了");
    }

    @Override
    public void beSelled() {
        DPUtil.print("衣服卖了");

    }
}
