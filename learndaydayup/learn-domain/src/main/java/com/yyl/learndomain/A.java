package com.yyl.learndomain;

public class A {
    static int a = 0 ;

    public static void main(String[] args) {
        System.out.println(getNum());
        System.out.println("a的值为"+a);
    }

    private static Object  getNum() {
        try {
            return a++;
        } catch (Exception e) {
            return 1;
        } finally {
            return "haha";
        }
    }
}
