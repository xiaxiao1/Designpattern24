package com.xiaxiao.designpattern24.visitor;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/31.
 */

public class StudentVisitor implements IVisitor {
    @Override
    public void visit(StudentData studentData) {
        DPUtil.print("我是个观察者 我就是看看数据");
        DPUtil.print(studentData.getInfo());
    }
}
