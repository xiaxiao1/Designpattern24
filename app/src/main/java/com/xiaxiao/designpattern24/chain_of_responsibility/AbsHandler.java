package com.xiaxiao.designpattern24.chain_of_responsibility;

import com.xiaxiao.designpattern24.util.DPUtil;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by xiaxiao on 2017/7/28.
 */

public abstract class AbsHandler implements IHandler {
    public static final int HANDLE_LEVEL_SON=0;
    public static final int HANDLE_LEVEL_HUSBAND=1;
    public static final int HANDLE_LEVEL_FATHER=2;

    private int level;
    private  IHandler nextHandler;

    public AbsHandler(int level) {
        this.level = level;
    }
    @Override
    public void setNext(IHandler handler) {
        this.nextHandler = handler;
    }

    /*
    * 在构造方法里设置
    * */
   /* @Override
    public void setLevel(int level) {
        this.level = level;
    }*/

    @Override
    public final void handleRequeset(IRequest request) {
        if (request.getLevel() == this.level) {
            this.response(request);
        }
        else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequeset(request);
            } else {
                DPUtil.print("没有人能处理的了这个请求，拒绝！");
            }
        }

    }

    /*对请求惊醒回应*/
    protected abstract void response(IRequest request);
}
