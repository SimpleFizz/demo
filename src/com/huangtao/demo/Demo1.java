package com.huangtao.demo;

import java.util.ArrayList;
import java.util.Date;

public class Demo1 {
    static int age ;
    static String name ;
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(name);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print("*");
                System.out.println();
            }
        }
        f1(3);
    }

    public static  void f1(int m) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        Date date = new Date();
        System.out.println("m = [" + m + "]");
        String[] arr = new String[]{"huangtao", "lisi", "zhangsan"};
        for (int i = 0; i < arr.length; i++) {

        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
        public void testHash(){
            System.out.println();
        }
    }

