package com.jzy.pattern.builder;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/13 15:48
 **/
public class Test {
    public static void main(String[] args) {
        Builder builder=new MacbookBulder();
        Director director=new Director(builder);
        director.constract("英特尔主板","Retina显示器","Mac OS X系统");
        System.out.println(builder.getComputer().toString());
    }
}
