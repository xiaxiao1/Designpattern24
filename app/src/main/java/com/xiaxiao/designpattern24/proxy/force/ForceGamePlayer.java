package com.xiaxiao.designpattern24.proxy.force;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/26.
 */

public class ForceGamePlayer implements ForceIGamePlayer {
    String name;
    ForceIGamePlayer gamePlayerProxy=null;

    public ForceGamePlayer(String name) {
        this.name = name;
    }

    public ForceIGamePlayer getProxy() {
        this.gamePlayerProxy = new ForceGamePlayerProxy(this);
        return this.gamePlayerProxy;
    }
    @Override
    public void login(String name, String password) {
//        this.name = name;
        if (isProxy()) {
            DPUtil.print(this.name + "use net name :" + name + " have login ");
        } else {
            DPUtil.print("现在是强制代理，请找指定的代理执行");
        }

    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            DPUtil.print(this.name+" is killing");
        }else {
            DPUtil.print("现在是强制代理，请找指定的代理执行");
        }
    }

    @Override
    public void update() {
        if (isProxy()) {
            DPUtil.print(this.name+" update");
        }else {
            DPUtil.print("现在是强制代理，请找指定的代理执行");
        }
    }


    public boolean isProxy() {
        return gamePlayerProxy != null;
    }
}
