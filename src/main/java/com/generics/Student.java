package com.generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int roll_no;
    String name;
    int age;

    Student(){}

    Student(int roll_no1,String name,int age){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if (age> st.age) {
            return 1;
        }
        else
            return -1;
    }


    }
 class TestSort3{
    public  static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(20,"j",33));
        al.add(new Student(10,"r",3));
        al.add(new Student(120,"rajdhar",37));

        Student s = new Student();

        Collections.sort(al);
        for (Student st:al)
        {
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }


        System.out.println(testList(new Integer[]{12,15,16}));
        System.out.println(testList(new Double[]{12.8,15.0,16.1}));

    }
    public static <T> List<T> testList(T[] t){

        List<T> mylist = new ArrayList<>();
        for (T item :t){
            mylist.add(item);
        }
        return mylist;

    }


}
