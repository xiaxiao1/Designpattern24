package com.xiaxiao.designpattern24.bridge.interfaces;


/**
 * Created by xiaxiao on 2017/7/25.
 */

public abstract class Crop {
    private Product product;

    public Crop(Product project) {
        this.product = project;
    }

    public void produce() {
        this.product.beProduced();
    }

    public void sell() {
        this.product.beSelled();
    }

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
