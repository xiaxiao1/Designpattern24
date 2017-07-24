package com.xiaxiao.designpattern24.builder;

import com.xiaxiao.designpattern24.builder.interfaces.CarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarModel;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/7/24.
 */

public class BengBengCarBuilder extends CarBuilder {

    //如果这样声明一个car的话，那岂不是这个builder创建的每一个car都是这个bengbengCar了？
    //可以吗？
    //还是每获取一个car就创建一个新的,
    //不是很理解，所以我在car的抽象类中添加一个createcar方法，用来事先创建一个需要配置的car，不知道这样做会不会又破坏了设计模式的哪些要求
//    private BengBengCar bengBengCar = new BengBengCar();
    private BengBengCar bengBengCar;

    public BengBengCarBuilder() {

    }

    @Override
    public CarModel getCarModel() {
        return bengBengCar;
    }

    /**
     * 应该说有了其他的三个方法的话，，这个就可以废掉了吧
     * @param list
     * @return
     */
    @Override
    public CarBuilder setOrder(ArrayList<String> list) {
        this.bengBengCar.setOrder(list);
        return this;
    }

    @Override
    public CarBuilder setOrder() {
        this.bengBengCar.setOrder(this.order);
        return this;
    }

    @Override
    public CarBuilder prepareACarmodel() {
        bengBengCar = new BengBengCar();
        return this;
    }
}
