package com.xiaxiao.designpattern24.chain_of_responsibility;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public interface IRequest {
    public int getLevel();

    public void request();

    public void postRequest(IHandler handler);

}
