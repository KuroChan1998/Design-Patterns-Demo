package com.jzy.pattern.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}