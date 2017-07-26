package com.xiaxiao.designpattern24.command.commands;

import com.xiaxiao.designpattern24.command.bean.ProjectManager;
import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.command.bean.UI;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class ManagerCommand extends AbstractCommand {
    public ManagerCommand() {
        super(new ProjectManager());
    }

    @Override
    protected void execute(Staff receiver) {
        DPUtil.print("这是一个给项目经理的命令");
        receiver.work();
    }
}
