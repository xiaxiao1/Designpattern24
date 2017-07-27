package com.xiaxiao.designpattern24.observer;

import com.xiaxiao.designpattern24.observer.interfaces.IGirlFriend;
import com.xiaxiao.designpattern24.observer.interfaces.MyObserver;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/27.
 */

public class GF implements IGirlFriend,MyObserver {
    String name;

    public GF(String name) {
        this.name = name;
    }
    @Override
    public void doSomething(String s) {
        DPUtil.print(this.name+"我在看着你哦，你正在"+s);

    }

    @Override
    public void update(String meg) {
        DPUtil.print("行为已被监视：");
        this.doSomething(meg);
    }
}
