package com.classes.javainterviewprep;

public class PrimeNumber {
    public static void isNumberPrime(int num) {
        int n = num;
        boolean isPrime = true;

        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }else{
            isPrime = false;
        }
        System.out.println("Given number "+n+" is prime? "+isPrime);
    }

    public static void main(String[] args) {
        isNumberPrime(6);
    }
}
