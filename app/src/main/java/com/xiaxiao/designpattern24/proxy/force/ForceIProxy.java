package com.xiaxiao.designpattern24.proxy.force;

/**
 * Created by xiaxiao on 2017/6/27.
 * 代理模式一般是在真正执行的前后做一些拦截 过滤之类的操作，就像游戏中的某个操作可能要收费啊  计时啊，这些就不是真正的操作类要管的，而是在代理中添加的
 */


public interface ForceIProxy {
    void makeMoney();
}
