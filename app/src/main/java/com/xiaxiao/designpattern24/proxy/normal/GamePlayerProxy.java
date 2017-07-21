package com.xiaxiao.designpattern24.proxy.normal;

/**
 * Created by xiaxiao on 2017/6/26.
 * 游戏代练的   ，，对外调用的是他，但是真正好干活的还是被代理的人
 */

public class GamePlayerProxy implements IGamePlayer {
        private IGamePlayer player;


    public GamePlayerProxy(IGamePlayer iGamePlayer) {
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
        this.player.update();
    }
}
