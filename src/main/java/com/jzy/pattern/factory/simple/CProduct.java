package com.jzy.pattern.factory.simple;

/**
 * @ CProduct.java
 * 具体产品C
 * （可以看成是一种饮料：咖啡）
 */
public class CProduct extends Product{
    @Override
    void intro() {
        System.out.println("咖啡");
    }
}