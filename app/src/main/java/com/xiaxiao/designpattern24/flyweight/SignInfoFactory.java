package com.xiaxiao.designpattern24.flyweight;

import com.xiaxiao.designpattern24.util.DPUtil;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by xiaxiao on 2017/8/3.
 */

public class SignInfoFactory {

    private static HashMap<String,SignInfo> pool = new HashMap<>();

    public static SignInfo getSiginInfo(String key) {
        SignInfo signInfo=null;
        if (pool.containsKey(key)) {
            signInfo = pool.get(key);
            DPUtil.print("from the pool");
        } else {
            signInfo = new SignInfo4Poll(key);
            pool.put(key, signInfo);
            DPUtil.print("new added");
        }

        return signInfo;
    }
}
