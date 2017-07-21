package com.xiaxiao.designpattern24.proxy.dynamic;

/**
 * Created by xiaxiao on 2017/6/27.
 *//***
 * 用户控制接口
 * @author Administrator
 *
 */
public interface UserManager {

    public void addUser(String userId,String userName);
    public void modifyUser(String userId,String userName);
    public void delUser(String userId);
    public String findUser(String userId);
}