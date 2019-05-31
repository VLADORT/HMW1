package com.vlad;



import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.next();
        int decimalNumber = 0;
        char[] x = binaryNumber.toCharArray();
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] == '1') {
                decimalNumber += 1 << (x.length - i - 1);
            }
        }
        System.out.println("(\"" + binaryNumber + "\" -> " + decimalNumber + ")");
    }
}
