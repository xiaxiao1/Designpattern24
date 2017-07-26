package com.xiaxiao.designpattern24.command.bean;

import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class Programmer extends Staff {
    @Override
    public void work() {
        DPUtil.print("程序猿在疯狂的写代码");
    }
}
