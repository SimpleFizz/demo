package com.huangtao.demo;


import java.util.ArrayList;

public class Demo {
    private String id;
    private int age;

    public Demo() {
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);

    }
    public static void f1() {
        System.out.println("我是f1方法");
    }

}
