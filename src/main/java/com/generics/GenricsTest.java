package com.generics;

public class GenricsTest {
    static <T> void genticdisplay(T elemensts){
       // System.out.println(elemensts.getClass().getName()+" "+elemensts);
        System.out.println(elemensts);
    }
    public static void main(String[] args) {
        genticdisplay(12.4);
        genticdisplay(35);
        genticdisplay("raj");

    }
}
