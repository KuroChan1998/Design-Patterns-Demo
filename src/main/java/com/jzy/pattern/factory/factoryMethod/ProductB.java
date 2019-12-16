package com.jzy.pattern.factory.factoryMethod;

/**
 * @ ProductB.java
 * 具体产品B
 */
public class ProductB extends Product{
    @Override
    void intro() {
        System.out.println("饮料B");
    }
}