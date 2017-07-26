package com.xiaxiao.designpattern24.bridge;

import com.xiaxiao.designpattern24.bridge.interfaces.Crop;
import com.xiaxiao.designpattern24.bridge.interfaces.Product;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/25.
 */

public class HouseCrop extends Crop {
    public HouseCrop(House project) {
        super(project);
    }

    public void makeMoney() {
        super.makeMoney();
        DPUtil.print("哈哈，卖房子真赚钱啊");
    }
}
