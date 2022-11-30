package com.generics;

public class GenericsTypeclass<T> {
    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsTypeclass<String> type =new GenericsTypeclass<>();
        type.setT("raj");
        GenericsTypeclass type1 =new GenericsTypeclass();
        type1.setT("rajdhar");
       type1.setT(123);
        System.out.println(type1.getT());


    }
}
