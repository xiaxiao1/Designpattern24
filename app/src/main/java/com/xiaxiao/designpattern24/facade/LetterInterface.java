package com.xiaxiao.designpattern24.facade;

/**
 * Created by xiaxiao on 2017/7/17.
 */

public interface LetterInterface {
    public void writeContext(String context);

    public void writeEnvelope(String address);

    public void putLetterInEnvelope();

    public void sendLetter();
}
