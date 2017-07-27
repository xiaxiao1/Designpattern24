package com.xiaxiao.designpattern24.composite;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/27.
 *
 * 这个模式写的例子和设计模式之禅书上的不太一样，感觉应该是可以的吧，  brach和leaf都是node啊
 */

public interface StaffNodeInterface {
    public void addChild(StaffNodeInterface child);

    /*
    * 补充的，便于向上回溯
    * */
    public void setParent(StaffNodeInterface parent);

    public StaffNodeInterface getParent();

    public String  getInfo();

    public ArrayList<StaffNodeInterface> getChildren();

    public boolean hasChild();
}
