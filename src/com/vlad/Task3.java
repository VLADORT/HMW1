package com.vlad;

public class Task3 {
    public static void countInt(){
        int a = -1;
        int counter=0;
        while (a!=0){
            a=a>>>1;
            counter++;
        }
        System.out.println(counter);

    }
    public static void countByte(){
        byte a = -1;
        int counter=0;
        while (a!=0){
            a=(byte)( a<<1);
            counter++;
        }
        System.out.println(counter);

    }
    public static void countLong(){
        long a = -1;
        int counter=0;
        while (a!=0){
            a=( a>>>1);
            counter++;
        }
        System.out.println(counter);

    }
    public static void countShort(){
        short a = -1;
        int counter=0;
        while (a!=0){
            a=(short) ( a<<1);
            counter++;
        }
        System.out.println(counter);

    }
    public static void main(String[] args) {

        int number = 21474;
        byte number1 = 127;
        short number2 = 50;
        long number3 = 2131231234;
        int counter1;
        int counter2;
        int counter3;
        int counter = counter1 = counter2 = counter3 = 0;
        while (number > 0) {
            counter++;
            number = number >> 1;
        }
        while (number1 > 0) {
            counter1++;
            number1 = (byte) (number1 >> 1);
        }
        while (number2 > 0) {
            counter2++;
            number2 = (short) (number2 >> 1);
        }
        while (number3 > 0) {
            counter3++;
            number3 = (long) (number3 >> 1);
        }


        System.out.println(counter + " " + counter1 + " " + counter2 + " " + counter3);
    countInt();
    countByte();
    countLong();
    countShort();}
}
