package com.xiaxiao.designpattern24.visitor;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/31.
 */

public class StudentMasterVisitor implements IVisitor {
    @Override
    public void visit(StudentData studentData) {
        DPUtil.print("我是个观察者 我要修改数据");
        DPUtil.print(studentData.getInfo());
        DPUtil.print("巴拉巴拉巴拉，改完数据了");
    }
}
