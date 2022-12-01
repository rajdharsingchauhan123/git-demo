package com.generics;

interface mylamda{
    public void display();
}

public class Lambda {
    public void method1()
    {
     mylamda ml=()->{
         int count =0;
         System.out.println("HII");
         System.out.println("hello raj"+count);
     };
     ml.display();


    }
}
   class lambdademo{
    public static void main(String[] args) {
        Lambda d = new Lambda();
                d.method1();
    }
}
