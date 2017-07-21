package com.xiaxiao.designpattern24.adapter;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/19.
 */

public class AdapterUser extends OtherUserType implements UserInterface {


    @Override
    public String getName() {
        String name = super.getInfo()[0];
        DPUtil.print(name);
        return null;
    }

    @Override
    public String getPhone() {
        String phone = super.getInfo()[1];
        DPUtil.print(phone);
        return null;
    }

    @Override
    public String getAddress() {
        String address = super.getInfo()[2];
        DPUtil.print(address);
        return null;
    }
}
