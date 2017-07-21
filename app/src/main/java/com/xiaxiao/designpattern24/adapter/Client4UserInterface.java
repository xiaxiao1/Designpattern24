package com.xiaxiao.designpattern24.adapter;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/19.
 */

public class Client4UserInterface {
    /**
     * 只能操作UserInterface类型的对象
     * @param userInterface
     */
    public void getInfo(UserInterface userInterface) {
        DPUtil.print(userInterface.getName()+"  "+userInterface.getPhone()+"  "+userInterface.getAddress());

    }
}
