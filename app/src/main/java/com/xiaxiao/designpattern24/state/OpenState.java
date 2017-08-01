package com.xiaxiao.designpattern24.state;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/1.
 */

/*
* 什么状态负责执行什么操作
* */
public class OpenState extends LiftState {
    @Override
    public void open() {
        DPUtil.print("OK:门打开了");
    }

    @Override
    public void close() {
        super.liftContext.setLiftState(LiftContext.CLOSE_STATE);
        super.liftContext.getLiftState().close();
    }

    @Override
    public void run() {
        DPUtil.print("Error：门开着，不能运行");
    }

    @Override
    public void stop() {
        super.liftContext.setLiftState(LiftContext.STOP_STATE);
        super.liftContext.getLiftState().stop();
    }
}
