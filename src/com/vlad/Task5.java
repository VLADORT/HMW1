package com.vlad;

public class Task5 {
    public static void main(String[] args) {
        int a = 255;
        int pos = 7;
        a = a & ~(1 << pos);
        System.out.println(a);
    }
}
