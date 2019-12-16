package com.jzy.pattern.factory.simple;

/**
 * @ AProduct.java
 * 具体产品A
 * （可以看成是一种饮料：可乐）
 */
public class AProduct extends Product{
    @Override
    void intro() {
        System.out.println("可乐");
    }
}
