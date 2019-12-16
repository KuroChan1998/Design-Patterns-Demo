package com.jzy.pattern.facade;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Test
 * @description //TODO
 * @date 2019/12/15 15:28
 **/
public class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
