package com.jzy.pattern.proxy.static_;

/**
 * @Auther: dan gao
 * @Description:
 * @Date: 22:43 2018/1/9 0009
 */
public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");

    }
}