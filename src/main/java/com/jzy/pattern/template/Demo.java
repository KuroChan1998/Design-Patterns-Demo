package com.jzy.pattern.template;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/14 19:12
 **/
public class Demo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
