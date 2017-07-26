package com.xiaxiao.designpattern24.command.bean;

import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/26.
 */

public class ProjectManager extends Staff {
    @Override
    public void work() {
        DPUtil.print("项目经理在制定项目需求");
    }
}
