package com.jzy.pattern.factory.Abstract;

/**
 * @ Factory.java
 * 抽象工厂
 */
abstract class Factory {
    //生产饮料
    abstract Product getProductA();
    //生产零食
    abstract Product getProductB();
}