package com.classes.javainterviewprep;

public class EvenOfOdd {
    public static void isNumberOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }


    public static void main(String[] args) {
        EvenOfOdd.isNumberOdd(14);
    }

}
