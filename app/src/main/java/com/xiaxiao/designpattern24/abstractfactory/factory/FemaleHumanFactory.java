package com.xiaxiao.designpattern24.abstractfactory.factory;

import com.xiaxiao.designpattern24.abstractfactory.human.FemaleBlackHuman;
import com.xiaxiao.designpattern24.abstractfactory.human.FemaleYelloHuman;
import com.xiaxiao.designpattern24.abstractfactory.human.Human;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public class FemaleHumanFactory extends AbstractFactory {


    @Override
    public Human createYellowHuman() {
        return  new FemaleYelloHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
