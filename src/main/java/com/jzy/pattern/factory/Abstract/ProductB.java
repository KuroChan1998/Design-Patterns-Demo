package com.jzy.pattern.factory.Abstract;

/**
 * @ ProductB.java
 * @具体产品B
 * @（可以看成是一种饮料：奶茶）
 */
abstract class ProductB extends Product {
    @Override
    void intro() {
        System.out.println("奶茶");
    }
}