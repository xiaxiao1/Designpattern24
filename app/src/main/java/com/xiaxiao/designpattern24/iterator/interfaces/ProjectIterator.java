package com.xiaxiao.designpattern24.iterator.interfaces;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public class ProjectIterator implements IProjectIterator {
    ArrayList projects;
    int currentIndex;
    public ProjectIterator(ArrayList arrayList) {
        this.projects = arrayList;
    }
    @Override
    public boolean hasNext() {

        return (currentIndex<projects.size()&&projects.get(currentIndex)!=null);
    }

    @Override
    public  Object next() {
        return projects.get(currentIndex++);
    }

    @Override
    public void remove() {

    }
}
