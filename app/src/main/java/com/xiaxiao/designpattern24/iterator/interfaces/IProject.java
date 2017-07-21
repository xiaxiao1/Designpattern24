package com.xiaxiao.designpattern24.iterator.interfaces;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public interface IProject {
    public void getInfo();
    public void add(String name,String num,String cost);

    public IProjectIterator iterator();
}
