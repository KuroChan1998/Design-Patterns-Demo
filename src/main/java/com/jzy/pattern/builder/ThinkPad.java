package com.jzy.pattern.builder;

public class ThinkPad {

    private String mBoard;
    private String mDisplay;
    private String mOs;

    private ThinkPad(Builder builder){
        this.mBoard=builder.mBoard;
        this.mDisplay=builder.mDisplay;
        this.mOs=builder.mOs;
    }

    public String getBoard() {
        return mBoard;
    }

    public String getDisplay() {
        return mDisplay;
    }


    public String getOs() {
        return mOs;
    }


    static class Builder{

        private String mBoard;
        private String mDisplay;
        private String mOs;

        public Builder setBoard(String board){
            this.mBoard=board;
            return this;
        }

        public Builder setDisplay(String display){
            this.mDisplay=display;
            return this;
        }

        public Builder setOs(String os){
            this.mOs=os;
            return this;
        }

        public ThinkPad builder(){
            return new ThinkPad(this);
        }
    }

    @Override
    public String toString() {
        return "ThinkPad{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ThinkPad thinkPad=
                new ThinkPad.Builder().setBoard("Intel").setDisplay("JDI").setOs("Windows 10").builder();
        System.out.println(thinkPad);
    }
}