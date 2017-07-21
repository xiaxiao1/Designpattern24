package com.xiaxiao.designpattern24.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by xiaxiao on 2017/6/28.
 */
public class ExtendSingleTon {
    //定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    //每个皇帝都有名字， 使用一个ArrayList来容纳， 每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();
    //定义一个列表， 容纳所有的皇帝实例
    private static ArrayList<ExtendSingleTon> emperorList = new ArrayList<ExtendSingleTon>();
    //当前皇帝序列号
    private static int countNumOfEmperor = 0;

    //产生所有的对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new ExtendSingleTon("皇" + (i + 1) + "帝"));
        }
    }

    private ExtendSingleTon() {
//世俗和道德约束你， 目的就是不产生第二个皇帝
    }//传入皇帝名称， 建立一个皇帝对象

    private ExtendSingleTon(String name) {
        nameList.add(name);
    }//随机获得一个皇帝对象

    public static ExtendSingleTon getInstance() {
        Random random = new Random();
//随机拉出一个皇帝， 只要是个精神领袖就成
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }//皇帝发话了

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}