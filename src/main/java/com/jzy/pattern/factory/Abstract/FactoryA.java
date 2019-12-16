package com.jzy.pattern.factory.Abstract;

/**
 * @ FactoryA.java
 * 具体工厂A
 * 负责具体的A类产品生产
 */
public class FactoryA extends Factory{
    @Override
    Product getProductA() {
        //生产矿泉水
        return new ProductAa();
    }
    @Override
    Product getProductB() {
        //生产面包
        return new ProductBb();
    }
}
