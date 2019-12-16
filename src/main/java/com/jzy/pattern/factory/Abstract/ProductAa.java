package com.jzy.pattern.factory.Abstract;

/**
 * @ ProductAa.java
 * 具体产品  (矿泉水)
 */
public  class ProductAa extends ProductA{
    @Override
    void intro() {
        System.out.println("矿泉水");
    }
}