package com.xiaxiao.designpattern24.command.commands;

import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.command.bean.UI;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class AddUICommand extends AbstractCommand {
    /*
    * 这里是指定的UI命令了。所以不需要对外提供传参，直接内置就好了。
    *
    * */
    public AddUICommand() {
        super(new UI());
    }

    @Override
    protected void execute(Staff receiver) {
        DPUtil.print("这是一个给UI设计师的命令");
        receiver.work();
    }
}
