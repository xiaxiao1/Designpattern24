package com.xiaxiao.designpattern24.observer.interfaces;

/**
 * Created by xiaxiao on 2017/7/27.
 * 被观察者需要继承这个接口
 */

public interface MyObservable {
    public void addObserver(MyObserver observer);

    public void deleteObsever(MyObserver observer);

    public void notifyObservers(String message);
}
