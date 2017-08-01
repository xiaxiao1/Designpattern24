package com.xiaxiao.designpattern24.state;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/1.
 */

/*
* 什么状态负责执行什么操作
* */
public class RunState extends LiftState {
    @Override
    public void open() {
        DPUtil.print("Error:正在运行，不能打开");
    }

    @Override
    public void close() {
        DPUtil.print("Error:正在运行，本来就是关着的");
    }

    @Override
    public void run() {
        DPUtil.print("OK:正在运行中");
    }

    @Override
    public void stop() {
        super.liftContext.setLiftState(LiftContext.STOP_STATE);
        super.liftContext.getLiftState().stop();
    }
}
