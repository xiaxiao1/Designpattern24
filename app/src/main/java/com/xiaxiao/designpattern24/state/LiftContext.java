package com.xiaxiao.designpattern24.state;

/**
 * Created by xiaxiao on 2017/8/1.
 */

public class LiftContext {

    /*
    * 如此看来，状态模式是面向对象的了。而不是面向接口的？
    * */
    public final static OpenState OPEN_STATE=new OpenState() ;
    public final static CloseState CLOSE_STATE=new CloseState();
    public final static RunState RUN_STATE=new RunState();
    public final static StopState STOP_STATE=new StopState();

    /*
    * 真正干活的人，
    * */
    LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setLiftContext(this);
    }

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void open() {
        this.liftState.open();

    }
    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }


}
