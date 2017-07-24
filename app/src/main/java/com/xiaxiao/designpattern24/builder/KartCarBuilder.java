package com.xiaxiao.designpattern24.builder;

import com.xiaxiao.designpattern24.builder.interfaces.CarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarModel;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/24.
 */

public class KartCarBuilder extends CarBuilder {

//    KartCar kartCar = new KartCar();
    KartCar kartCar;


    @Override
    public CarModel getCarModel() {
        return kartCar;
    }

    /**
     * 应该说有了其他的三个方法的话，，这个就可以废掉了吧
     * @param list
     * @return
     */
    @Override
    public CarBuilder setOrder(ArrayList<String> list) {
        this.kartCar.setOrder(list);
        return this;
    }

    @Override
    public CarBuilder setOrder() {
        this.kartCar.setOrder(this.order);
        return this;
    }

    @Override
    public CarBuilder prepareACarmodel() {
        kartCar = new KartCar();
        return this;
    }
}
