package com.xiaxiao.designpattern24.builder.interfaces;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/24.
 */

public abstract class CarBuilder {
    protected ArrayList<String> order = new ArrayList<>();
    public abstract CarModel getCarModel();
    public abstract CarBuilder setOrder(ArrayList<String> list);
    public abstract CarBuilder setOrder();
    public abstract CarBuilder prepareACarmodel();

    public CarBuilder clear(){
        this.order.clear();
        return this;
    }

    public CarBuilder start(){
        order.add(CarModel.START);
        return this;
    }
    public CarBuilder stop(){
        order.add(CarModel.STOP);
        return this;
    }
    public CarBuilder alarm(){
        order.add(CarModel.ALARM);
        return this;
    }
}
