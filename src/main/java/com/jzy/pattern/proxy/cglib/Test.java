package com.jzy.pattern.proxy.cglib;

import com.jzy.pattern.proxy.static_.BuyHouse;
import com.jzy.pattern.proxy.static_.BuyHouseImpl;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Test
 * @description //TODO
 * @date 2019/12/15 10:09
 **/
public class Test {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouse buyHouseCglibProxy = (BuyHouse) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHouse();
    }
}
