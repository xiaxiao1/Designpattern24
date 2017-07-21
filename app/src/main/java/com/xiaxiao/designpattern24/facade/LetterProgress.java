package com.xiaxiao.designpattern24.facade;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/17.
 */

public class LetterProgress implements LetterInterface {
    @Override
    public void writeContext(String context) {
        DPUtil.print("开始写信："+context);
    }

    @Override
    public void writeEnvelope(String address) {
        DPUtil.print("写信封:"+address);
    }

    @Override
    public void putLetterInEnvelope() {
        DPUtil.print("把信装进信封");
    }

    @Override
    public void sendLetter() {
        DPUtil.print("把信投递出去");
    }
}
