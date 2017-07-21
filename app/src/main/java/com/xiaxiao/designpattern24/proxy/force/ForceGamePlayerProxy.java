package com.xiaxiao.designpattern24.proxy.force;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/26.
 * 游戏代练的   ，，对外调用的是他，但是真正好干活的还是被代理的人
 */

public class ForceGamePlayerProxy implements ForceIGamePlayer ,ForceIProxy{
        private ForceIGamePlayer player;


    public ForceGamePlayerProxy(ForceIGamePlayer iGamePlayer) {
        this.player = iGamePlayer;
    }
    @Override
    public void login(String name, String password) {
        this.player.login(name,password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void update() {
        DPUtil.print("升级要收费的");
        this.player.update();
        makeMoney();
    }

    //这里就表示返回的是代理的代理
    @Override
    public ForceIGamePlayer getProxy() {
        return null;
    }


    @Override
    public void makeMoney() {
        DPUtil.print("赚了5块钱");
    }
}
