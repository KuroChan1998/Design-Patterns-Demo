package com.jzy.pattern.factory.simple;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/13 13:16
 **/
public class Test {
    public static void main(String[] args) {
        //创建具体的工厂
        Factory factory = new Factory();
        //根据传入的参数生产不同的产品实例
        //(按下不同的按钮，获取饮料)
        Product A = Factory.getProduct("A");
        A.intro();
        Product B = Factory.getProduct("B");
        B.intro();
        Product C = Factory.getProduct("C");
        C.intro();
    }
}
