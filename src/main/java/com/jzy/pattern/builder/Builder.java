package com.jzy.pattern.builder;

/*
 * 抽象Builder类
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 24
 */
public abstract class Builder {
    // 设置主板
    public abstract void builderBoard(String board);

    // 设置显示器
    public abstract void builderDisplay(String display);

    // 设置操作系统
    public abstract void builderOs(String os);

    // 创建Computer
    public abstract MacBook getComputer();
}