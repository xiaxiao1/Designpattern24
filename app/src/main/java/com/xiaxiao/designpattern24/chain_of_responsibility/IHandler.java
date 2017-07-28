package com.xiaxiao.designpattern24.chain_of_responsibility;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public interface  IHandler  {
    /*设置下一个处理者*/
    public void setNext(IHandler handler);



   /* *//*设置自己的级别*//*
    public void setLevel(int level);
*/
    public void handleRequeset(IRequest request);
}
