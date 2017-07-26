package com.xiaxiao.designpattern24.command.commands;

import com.xiaxiao.designpattern24.command.bean.Staff;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public abstract class AbstractCommand {

    //最后接收执行命令的当然是苦逼的员工了
    protected Staff staff;

    public AbstractCommand(Staff receiver) {
        this.staff = receiver;
//        execute(this.staff);
    }

    /*
    * 具体执行什么命令，由继承的子类来实现
    * */
    protected abstract void execute(Staff receiver);

    public void execute() {
        execute(this.staff);
    }
}
