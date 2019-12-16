package com.jzy.pattern.builder;

/*
 * 产品类，Product角色
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 24
 */
public class MacBook {

    private String mBoard;
    private String mDisplay;
    private String mOs;

    public String getBoard() {
        return mBoard;
    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public String getDisplay() {
        return mDisplay;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }


    public String getOs() {
        return mOs;
    }

    public void setOs(String os) {
        mOs = os;
    }

    @Override
    public String toString() {
        return "MacBook:" + "mBoard=" + mBoard + ",mDisplay=" + mDisplay + ",mOs=" + mOs;
    }

}