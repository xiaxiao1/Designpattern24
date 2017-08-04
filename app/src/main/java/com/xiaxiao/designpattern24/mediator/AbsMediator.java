package com.xiaxiao.designpattern24.mediator;

/**
 * Created by xiaxiao on 2017/8/2.
 */

public abstract class AbsMediator {
    protected Colleague1 colleague1;
    protected Colleague2 colleague2;
    protected Colleague3 colleague3;

    public AbsMediator() {
        colleague1=new Colleague1(this);
        colleague2=new Colleague2(this);
        colleague3=new Colleague3(this);
    }

    public abstract void execute(int type);

}
