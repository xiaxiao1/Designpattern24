package com.xiaxiao.designpattern24.strategy.interfaces;

import com.xiaxiao.designpattern24.strategy.HumorStrategy;
import com.xiaxiao.designpattern24.strategy.LoveContext;
import com.xiaxiao.designpattern24.strategy.MoneyStrategy;
import com.xiaxiao.designpattern24.strategy.TimeStrategy;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/6/22.
 */

public class Boy {

    public void wantAGirlFriend() {
        DPUtil.print("我是个努力干活还不粘人的单身狗，我要找个女盆友");


    }
}
