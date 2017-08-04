package com.xiaxiao.designpattern24.memento.oldtype;

/**
 * Created by xiaxiao on 2017/8/4.
 */

public class Wife {
    private String mood;

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public WifeMemento getMemento() {
        return new WifeMemento((this.mood));
    }
}
