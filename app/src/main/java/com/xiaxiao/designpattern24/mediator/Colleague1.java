package com.xiaxiao.designpattern24.mediator;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/2.
 */

public class Colleague1 extends AbsColleague {
    public Colleague1(AbsMediator mediator) {
        super(mediator);
    }

    public void selfWork() {
        DPUtil.print("我是员工1 ，我在做自己的事情");
    }
    public void toghterWork() {
        DPUtil.print("我是员工1 ，我正在和其他同事一起协作");
        super.mediator.execute(Mediator.WORK_TYPE_12);
    }


}
