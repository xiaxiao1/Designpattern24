package com.xiaxiao.designpattern24.factorymethod;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public abstract class AbstractFactory {
    public abstract <T extends Human> T createHuman(Class<T> humanClass);
}
