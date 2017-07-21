package com.xiaxiao.designpattern24.adapter;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/19.
 */

public class UserImpl implements UserInterface {
    @Override
    public String getName() {
        DPUtil.print("这是名字");
        return null;
    }

    @Override
    public String getPhone() {
        DPUtil.print("这是电话号码");
        return null;
    }

    @Override
    public String getAddress() {
        DPUtil.print("这是地址");
        return null;
    }
}
