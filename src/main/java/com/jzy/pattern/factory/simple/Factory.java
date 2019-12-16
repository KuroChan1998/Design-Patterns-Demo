package com.jzy.pattern.factory.simple;

/**
 * 工厂
 * 负责实现创建所有实例的内部逻辑，并提供一个外界调用的方法，创建所需的产品对象。
 */
public class Factory {
    /**
     * 供外界调用的方法
     * （可以看成是对外提供的三种按钮）
     * @param type
     * @return 产品实例
     */
    public static Product getProduct(String type) {
        switch (type) {
            case "A":
                return new AProduct();
            case "B":
                return new BProduct();
            case "C":
                return new CProduct();
            default:
                return null;
        }
    }
}