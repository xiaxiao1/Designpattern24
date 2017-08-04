package com.xiaxiao.designpattern24.mediator;

/**
 * Created by xiaxiao on 2017/8/2.
 */
/*
* 想不出来比较贴切的情景，看来还是对业务的抽象提取能力不够。

* 凑合看着理解了
* */
public class Mediator extends AbsMediator {

    public static final int WORK_TYPE_12=12;
    public static final int WORK_TYPE_13=13;
    public static final int WORK_TYPE_23=23;
    public static final int WORK_TYPE_123=123;
    @Override
    public void execute(int type) {
        if (type==WORK_TYPE_12) {
            this.mediator12();
        }
        if (type==WORK_TYPE_13) {
            this.mediator13();
        }
        if (type==WORK_TYPE_23) {
            this.mediator23();
        }
        if (type==WORK_TYPE_123) {
            this.mediator123();
        }
    }

    public void mediator12() {
        super.colleague1.selfWork();
        super.colleague2.toghterWork();

    }
    public void mediator13() {
        super.colleague1.selfWork();
        super.colleague3.toghterWork();

    }
    public void mediator23() {
        super.colleague2.selfWork();
        super.colleague3.toghterWork();
    }
    public void mediator123() {
        super.colleague1.selfWork();
        super.colleague2.toghterWork();
        super.colleague3.toghterWork();
    }
}
