package com.xiaxiao.designpattern24.memento.oldtype;

/**
 * Created by xiaxiao on 2017/8/4.
 */


/*
* Wife不同直接同WifeMemento类交流， 类只能与朋友类交流
*
* 所以创建一个类来管理wife的memento
* */
public class CareTacker {
    private WifeMemento memento;

    public WifeMemento getMemento() {
        return memento;
    }

    public void setMemento(WifeMemento memento) {
        this.memento = memento;
    }
}
