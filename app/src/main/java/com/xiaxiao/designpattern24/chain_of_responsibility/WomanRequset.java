package com.xiaxiao.designpattern24.chain_of_responsibility;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public class WomanRequset implements IRequest {

    int level;
    String type;
    public WomanRequset(int level,String type) {
        this.level = level;
        this.type = type;
    }
    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void request() {
        DPUtil.print(type+"我要出去玩");
    }

    /*
    * 可不可以像下面这样写，站在请求者的角度来触发，
    * 。我把我要干什么写好了，然后把请求发出去就行，管他到底谁来处理
    * */
    @Override
    public void postRequest(IHandler handler) {
        handler.handleRequeset(this);
    }
}
