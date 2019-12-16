package com.jzy.pattern.state;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/14 15:25
 **/
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
