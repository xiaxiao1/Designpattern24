package com.xiaxiao.designpattern24.factorymethod;

import com.xiaxiao.designpattern24.util.DPUtil;

/**
 * Created by xiaxiao on 2017/7/11.
 */

public class HumanFactory extends AbstractFactory {
    /*public static Human getHuman(Class cl) {
        Human human=null;
        try{
            human = (Human)Class.forName(cl.getName()).newInstance();
        } catch (IllegalAccessException e) {
            DPUtil.print("人种定义错误");
            e.printStackTrace();
        } catch (InstantiationException e) {
            DPUtil.print("必须置顶具体的人种");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            DPUtil.print("指定的类不存在");
            e.printStackTrace();
        }

        return human;
    }*/

    @Override
    public <T extends Human> T createHuman(Class<T> humanClass) {
        Human human=null;
        try{
            human = (Human)Class.forName(humanClass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            DPUtil.print("人种定义错误");
            e.printStackTrace();
        } catch (InstantiationException e) {
            DPUtil.print("必须置顶具体的人种");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            DPUtil.print("指定的类不存在");
            e.printStackTrace();
        }

        return (T)human;
    }
}
