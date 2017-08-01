package com.xiaxiao.designpattern24.state;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by xiaxiao on 2017/8/1.
 */

public abstract class LiftState {
    protected LiftContext liftContext;

    public void setLiftContext(LiftContext liftContext) {
        this.liftContext = liftContext;
//        HashMap h;
//                TreeMap t;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
