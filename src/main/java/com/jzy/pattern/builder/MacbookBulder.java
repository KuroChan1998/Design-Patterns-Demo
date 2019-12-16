package com.jzy.pattern.builder;

/*
 * 具体的Builder类
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 24
 */
public class MacbookBulder extends Builder{


    private MacBook mMacBook=new MacBook();

    @Override
    public void builderBoard(String board) {
        mMacBook.setBoard(board);

    }

    @Override
    public void builderDisplay(String display) {
        mMacBook.setDisplay(display);

    }

    @Override
    public void builderOs(String os) {
        mMacBook.setOs(os);

    }

    @Override
    public MacBook getComputer() {
        return mMacBook;
    }
}