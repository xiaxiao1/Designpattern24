package com.xiaxiao.designpattern24.command.commands;

import com.xiaxiao.designpattern24.command.bean.Programmer;
import com.xiaxiao.designpattern24.command.bean.ProjectManager;
import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class ProgrammerCommand extends AbstractCommand {
    public ProgrammerCommand() {
        super(new Programmer());
    }

    @Override
    protected void execute(Staff receiver) {
        DPUtil.print("给程序猿的命令，，好好干活！");
        receiver.work();

    }
}
