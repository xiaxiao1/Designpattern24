package com.xiaxiao.designpattern24.composite;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/27.
 */

public class LiShiStaff extends AbstractStaffNode {

    private ArrayList<StaffNodeInterface> children = new ArrayList<>();

    public LiShiStaff(String name, String position, String salary) {
        super(name, position, salary);
    }

    @Override
    public void addChild(StaffNodeInterface child) {
        this.children.add(child);
        child.setParent(this);
    }

    @Override
    public ArrayList<StaffNodeInterface> getChildren() {
        return this.children;
    }

    @Override
    public boolean hasChild() {
        return this.children.size()>0;
    }
}
