package com.jzy.pattern.proxy.static_;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Test
 * @description //TODO
 * @date 2019/12/15 9:54
 **/
public class Test {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
