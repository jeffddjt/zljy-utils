package com.zljy.utils.http;


public enum ResultCode {
    SUCCESS(0,"OK"),
    FAILED(1,"FAILED");


    private int index;
    private String text;

    ResultCode(int index,String text){
        this.index=index;
        this.text=text;
    }

    public int getIndex() {
        return index;
    }


    public String getText() {
        return text;
    }

}
