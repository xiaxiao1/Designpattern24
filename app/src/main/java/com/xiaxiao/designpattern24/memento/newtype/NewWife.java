package com.xiaxiao.designpattern24.memento.newtype;

import com.xiaxiao.designpattern24.memento.oldtype.Wife;

/**
 * Created by xiaxiao on 2017/8/4.
 */

/*
* NewWife同时也是自己的备忘录了，同时也管理了自己的备忘录。因此不需要CareTacker类
* */
public class NewWife  implements  Cloneable{
    MyMemento memento;

    String mood;


    public void createMemento() {
        NewWife nn = this.clone();
        this.memento = new MyMemento();
        this.memento.setMemento(nn);
    }

    public void restoreMemento() {
        NewWife n = this.getMemento().getMemento();
        this.restoreInfo(n);
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    /*
    * 在外部，即使调用了这个方法，得到memento,也无法对这个memento进行操作。接口和类的私有类型起到了一定的保护作用
    * */
    public MyMemento getMemento() {
        return memento;
    }

    /*
    * 恢复各属性的信息
    * */
    private void restoreInfo(NewWife newWife) {
        this.setMood(newWife.getMood());
    }

    @Override
    protected NewWife clone()  {
        NewWife n=null;
        try {
            n = (NewWife) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return n;
    }

    /*
        * 都是private 类型
        * */
    private class MyMemento implements IMemento {
        NewWife memento;

        private NewWife getMemento() {
            return memento;
        }

        private void setMemento(NewWife memento) {
            this.memento = memento;
        }
    }


    /*
    * 空接口，保证备忘录的安全性，数据的纯洁性， 只能内部操作，外部只能访问。
    * */
    public interface IMemento {


    }

}
