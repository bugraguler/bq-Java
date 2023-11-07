package com.classes.javainterviewprep;

public class PrimeTwo {
    public static void isPrime(int num) {
        int n = num;
        boolean isPrime = true;

        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        System.out.println(isPrime);
    }

    public static void main(String[] args) {
        isPrime(4);
    }
}
