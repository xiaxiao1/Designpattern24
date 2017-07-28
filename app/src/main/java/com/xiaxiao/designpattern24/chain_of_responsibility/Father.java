package com.xiaxiao.designpattern24.chain_of_responsibility;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public class Father extends  AbsHandler {
    public Father() {
        super(AbsHandler.HANDLE_LEVEL_FATHER);
    }

    @Override
    public void response(IRequest request) {
        DPUtil.print("i am father , I handle the request");
        request.request();
    }
}
