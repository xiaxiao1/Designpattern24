package com.xiaxiao.designpattern24.abstractfactory.factory;

import com.xiaxiao.designpattern24.abstractfactory.human.Human;
import com.xiaxiao.designpattern24.abstractfactory.human.MaleBlackHuman;
import com.xiaxiao.designpattern24.abstractfactory.human.MaleYelloHuman;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public class MaleHumanFactory extends AbstractFactory {


    @Override
    public Human createYellowHuman() {
        return  new MaleYelloHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
