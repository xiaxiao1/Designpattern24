package com.xiaxiao.designpattern24.bridge;

import com.xiaxiao.designpattern24.bridge.interfaces.Crop;
import com.xiaxiao.designpattern24.bridge.interfaces.Product;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/25.
 * 山寨公司，什么都做，什么产品都生产，同一个公司不变，生产不同的产品，
 * 这个就是解耦。本来是公司的制造，贩卖的功能，提取出来，交给了具体的产品类去实现，
 */

public class ShanZhaiCrop extends Crop {
    public ShanZhaiCrop(Product project) {
        super(project);
    }

    public void makeMoney() {
        super.makeMoney();
        DPUtil.print("哈哈，卖了一件山寨产品");
    }
}
