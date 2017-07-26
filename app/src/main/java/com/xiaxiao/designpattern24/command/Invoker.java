package com.xiaxiao.designpattern24.command;

import com.xiaxiao.designpattern24.command.commands.AbstractCommand;

/**
 * Created by xiaxiao on 2017/7/26.
 */

/*
* 负责人，对外接收高层的各种命令并执行，其实干活的还是顶层的小弟弟们
* */
public class Invoker {
    AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();

    }
}
