package com.xiaxiao.designpattern24.proxy.normal;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/26.
 */

public class GamePlayer implements  IGamePlayer {
    String name;

    public GamePlayer(String name) {
        this.name = name;
    }
    @Override
    public void login(String name, String password) {
//        this.name = name;
        DPUtil.print(this.name+"use net name :"+name+" have login ");

    }

    @Override
    public void killBoss() {
        DPUtil.print(this.name+" is killing");
    }

    @Override
    public void update() {

        DPUtil.print(this.name+" update");
    }
}
