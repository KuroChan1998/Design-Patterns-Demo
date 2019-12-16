package com.jzy.pattern.chainOfResponsibility;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/13 16:58
 **/
public class Test {
    public static void main(String[] args) {
        AbstractLogger logger = ChainPatternDemo.getChainOfLoggers();
        logger.logMessage(1,"一级日志记录");
        System.out.println("--------------------------------");
        logger.logMessage(2,"二级日志记录");
        System.out.println("--------------------------------");
        logger.logMessage(3,"三级日志记录");
    }
}
