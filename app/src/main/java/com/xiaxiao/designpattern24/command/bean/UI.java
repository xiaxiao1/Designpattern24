package com.xiaxiao.designpattern24.command.bean;

import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class UI extends Staff {
    @Override
    public void work() {
        DPUtil.print("UI设计师在设计界面 ");
    }
}
