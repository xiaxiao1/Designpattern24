package com.xiaxiao.designpattern24.singleton;

/**
 * Created by xiaxiao on 2017/6/28.
 */

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * 简单的在类加载的时候创建实例，避免了多线程问题
 */
public class SingleTon1 {
    private static final SingleTon1 singleTon1 = new SingleTon1();

    private SingleTon1() {

    }

    public synchronized static SingleTon1 getInstance() {
        return singleTon1;
    }

    public void say(String s) {
        DPUtil.print(s);
    }
}
