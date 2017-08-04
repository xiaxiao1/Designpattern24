package com.xiaxiao.designpattern24.flyweight;

/**
 * Created by xiaxiao on 2017/8/3.
 */

public class SignInfo4Poll extends SignInfo {
    /*
    * 细粒度对象的外部状态
    * */
    String key;

    public SignInfo4Poll(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
