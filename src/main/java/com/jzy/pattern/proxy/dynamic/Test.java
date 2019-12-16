package com.jzy.pattern.proxy.dynamic;

import com.jzy.pattern.proxy.static_.BuyHouse;
import com.jzy.pattern.proxy.static_.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Test
 * @description //TODO
 * @date 2019/12/15 9:58
 **/
public class Test {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
                Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }
}
