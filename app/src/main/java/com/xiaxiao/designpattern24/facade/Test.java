package com.xiaxiao.designpattern24.facade;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/17.
 */

public class Test {

    public static class Hello{
        public void say() {
            DPUtil.print("nihao");
        }
    }


    public class Hei extends Hello {
        public void say() {
            super.say();
            DPUtil.print("child is saying ");
        }
    }


    Hei hei;

    public void Ha() {
        hei = new Hei();
        hei.say();
    }
}
