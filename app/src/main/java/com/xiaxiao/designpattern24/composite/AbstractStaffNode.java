package com.xiaxiao.designpattern24.composite;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/27.
 */

public abstract class AbstractStaffNode implements StaffNodeInterface {
    private String name;
    private String position;
    private String salary;

    private StaffNodeInterface parent;

    public AbstractStaffNode(String name, String position, String salary) {
        this.name=name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return this.name + "    " + this.position + "    " + this.salary;
    }

    @Override
    public void setParent(StaffNodeInterface parent) {
        this.parent = parent;
    }

    @Override
    public StaffNodeInterface getParent() {
        return this.parent;
    }
}
