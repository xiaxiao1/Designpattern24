package com.xiaxiao.designpattern24.mediator;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/2.
 */

public class Colleague3 extends AbsColleague {
    public Colleague3(AbsMediator mediator) {
        super(mediator);
    }

    public void selfWork() {
        DPUtil.print("我是员工3 ，我在做自己的事情");
    }

    public void toghterWork() {
        DPUtil.print("我是员工3，我正在和其他同事一起协作");
    }
}


