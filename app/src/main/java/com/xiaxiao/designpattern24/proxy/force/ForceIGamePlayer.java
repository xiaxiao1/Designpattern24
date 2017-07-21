package com.xiaxiao.designpattern24.proxy.force;

/**
 * Created by xiaxiao on 2017/6/26.
 */

public interface ForceIGamePlayer {

    void login(String name, String password);

    void killBoss();

    void update();
    ForceIGamePlayer getProxy();
}
