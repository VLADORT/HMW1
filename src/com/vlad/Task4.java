package com.vlad;

public class Task4 {
    public static int gcd(int a,int b) {
        while (b !=0) {
            while (a>=b) a+=~b+1;
            int tmp = a;
            a = b;
            b = tmp;
            System.out.println(a+" "+b);

        }
        return a < 0 ? ~a : a;
    }
    public static void main(String[] args) {

   int a=5;
   int b =2;
        System.out.println(gcd(a, b));
    }
}



