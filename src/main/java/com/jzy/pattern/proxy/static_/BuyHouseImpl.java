package com.jzy.pattern.proxy.static_;

/**
 * @Auther: dan gao
 * @Description:
 * @Date: 22:42 2018/1/9 0009
 */
public class BuyHouseImpl implements BuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }
}