package com.xiaxiao.designpattern24.state;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/8/1.
 */

/*
* 什么状态负责执行什么操作
* */
public class CloseState extends LiftState {
    @Override
    public void open() {
        super.liftContext.setLiftState(LiftContext.OPEN_STATE);
        super.liftContext.getLiftState().open();
    }

    @Override
    public void close() {
        DPUtil.print("OK:门关上了");
    }

    @Override
    public void run() {
        super.liftContext.setLiftState(LiftContext.RUN_STATE);
        super.liftContext.getLiftState().run();
    }

    @Override
    public void stop() {
        super.liftContext.setLiftState(LiftContext.STOP_STATE);
        super.liftContext.getLiftState().stop();
    }
}
