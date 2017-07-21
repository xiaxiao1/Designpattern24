package com.xiaxiao.designpattern24.facade;

/**
 * Created by xiaxiao on 2017/7/17.
 */

public class FacadeLetter {

    LetterInterface letterInterface;

    public FacadeLetter() {
        letterInterface = new LetterProgress();
    }

    public void sendLetter(String context, String address) {
        letterInterface.writeContext(context);
        letterInterface.writeEnvelope(address);
        letterInterface.putLetterInEnvelope();
        letterInterface.sendLetter();
    }
}
