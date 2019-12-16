package com.jzy.pattern.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype p1 = new CreatePrototype("1");
        Prototype p2 = p1.clone();
        System.out.println(p1 == p2);

    }
}

