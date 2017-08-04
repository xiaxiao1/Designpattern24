package com.xiaxiao.designpattern24.mediator;

/**
 * Created by xiaxiao on 2017/8/2.
 */

public abstract class AbsColleague {
    AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;

    }
}
