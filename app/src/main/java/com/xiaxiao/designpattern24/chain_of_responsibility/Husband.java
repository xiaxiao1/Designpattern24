package com.xiaxiao.designpattern24.chain_of_responsibility;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public class Husband extends  AbsHandler {
    public Husband() {
        super(AbsHandler.HANDLE_LEVEL_HUSBAND);
    }

    @Override
    public void response(IRequest request) {
        DPUtil.print("i am husband , I handle the request");
        request.request();
    }
}
