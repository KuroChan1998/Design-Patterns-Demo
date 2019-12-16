package com.jzy.pattern.factory.Abstract;

public class Test {
    public static void main(String[] args) {
        //创建零食售卖机（具体工厂），
        FactoryA factoryA = new FactoryA();
        //获取矿泉水与面包（具体产品）
        factoryA.getProductA().intro();
        factoryA.getProductB().intro();
    }
}