package com.xiaxiao.designpattern24.strategy;

import com.xiaxiao.designpattern24.strategy.interfaces.IStrategy;

/**
 * Created by xiaxiao on 2017/6/22.
 * 装载妙计的锦囊
 */

public class LoveContext {
    private IStrategy strategy;

    public LoveContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 追女孩
     */
    public void goAfterGirl() {
        this.strategy.execute();
    }
}
