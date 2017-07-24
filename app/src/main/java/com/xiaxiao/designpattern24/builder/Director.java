package com.xiaxiao.designpattern24.builder;

import com.xiaxiao.designpattern24.builder.interfaces.CarModel;

/**
 * Created by xiaxiao on 2017/7/24.
 *
 * director类的存在就是向高层隐藏carmodel的具体获取过程，
 */

public class Director {
    BengBengCarBuilder bBuilder=new BengBengCarBuilder();
    KartCarBuilder kBuilder=new KartCarBuilder();

    public CarModel getATypeBengbeng() {

        return bBuilder.clear()
                .prepareACarmodel()
                .start()
                .alarm()
                .stop()
                .setOrder()
                .getCarModel();
    }

    public CarModel getBTypeBengbeng() {
        return bBuilder.clear()
                .prepareACarmodel()
                .alarm()
                .alarm()
                .alarm()
                .setOrder()
                .getCarModel();
    }

    public CarModel getCTypeKart() {
        return kBuilder.clear()
                .prepareACarmodel()
                .start()
                .stop()
                .alarm()
                .alarm()
                .setOrder()
                .getCarModel();
    }

    public CarModel getDTypeKart() {
        return kBuilder.clear()
                .prepareACarmodel()
                .start()
                .start()
                .alarm()
                .alarm()
                .alarm()
                .alarm()
                .setOrder()
                .getCarModel();
    }
}
