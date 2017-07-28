package com.xiaxiao.designpattern24.chain_of_responsibility;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public class Son extends  AbsHandler {
    public Son() {
        super(AbsHandler.HANDLE_LEVEL_SON);
    }

    @Override
    public void response(IRequest request) {
        DPUtil.print("i am son, I handle the request");
        request.request();
    }
}
