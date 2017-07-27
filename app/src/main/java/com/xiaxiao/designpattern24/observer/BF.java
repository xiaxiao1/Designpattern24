package com.xiaxiao.designpattern24.observer;

import com.xiaxiao.designpattern24.observer.interfaces.IBoyFriend;
import com.xiaxiao.designpattern24.observer.interfaces.MyObservable;
import com.xiaxiao.designpattern24.observer.interfaces.MyObserver;
import com.xiaxiao.designpattern24.util.DPUtil;

import java.util.Vector;

/**
 * Created by xiaxiao on 2017/7/27.
 */

public class BF implements IBoyFriend,MyObservable {

    Vector<MyObserver> observers = new Vector<>();

    @Override
    public void sleep() {
        DPUtil.print("正在睡觉");
        this.notifyObservers("sleep");
    }

    @Override
    public void chat() {
        DPUtil.print("正在聊天");
        this.notifyObservers("chat");
    }

    @Override
    public void funWithgirl() {
        DPUtil.print("正在和别的姑娘玩呢，，玩呢？！");
        this.notifyObservers("funwithgirl");
    }

    @Override
    public void addObserver(MyObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObsever(MyObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (MyObserver o:this.observers) {
            o.update(msg);
        }
    }
}
