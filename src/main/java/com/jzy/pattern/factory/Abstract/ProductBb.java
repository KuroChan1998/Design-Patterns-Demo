package com.jzy.pattern.factory.Abstract;

/**
 * @ ProductBb.java
 * 抽象产品  (面包)
 */
public class ProductBb extends ProductB{
    @Override
    void intro() {
        System.out.println("面包");
    }
}