package com.jzy.pattern.observer;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/13 21:44
 **/
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
