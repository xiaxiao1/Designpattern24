package com.xiaxiao.designpattern24.abstractfactory.human;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/13.
 */

public class FemaleBlackHuman extends YelloHuman {
    public void sex() {
        DPUtil.print("黑人女的");
    }
}
