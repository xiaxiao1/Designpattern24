package com.xiaxiao.designpattern24.abstractfactory.factory;

import com.xiaxiao.designpattern24.abstractfactory.human.Human;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public abstract class AbstractFactory {
    public abstract Human createYellowHuman();
    public abstract Human createBlackHuman();
    public abstract Human createWhiteHuman();
}
