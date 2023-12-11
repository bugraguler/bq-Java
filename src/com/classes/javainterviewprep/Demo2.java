package com.classes.javainterviewprep;

public abstract class Demo2 {
    static int[] arr = {1, 2, 3, 4, 5};
    static int countEven;
    static int countOdd;


    public static void isEven() {
        for (int a : arr) {
            if (a % 2 == 0) {
                countEven++;
                System.out.println(a + " is even number");

            } else {

                System.out.println(a + " is odd number");
                countOdd++;
            }
        }
        System.out.println("Even Number:" + countEven + " and Odd Number:" + countOdd);
    }

    public static void main(String[] args) {
        Demo2.isEven();
    }

}
