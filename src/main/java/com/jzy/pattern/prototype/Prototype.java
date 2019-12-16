package com.jzy.pattern.prototype;

public abstract class Prototype implements Cloneable{

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public Prototype clone() throws CloneNotSupportedException {

        return (Prototype) super.clone();

    }

}