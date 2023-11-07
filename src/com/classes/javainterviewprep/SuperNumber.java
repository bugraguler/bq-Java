package com.classes.javainterviewprep;

public class SuperNumber {
    public void isSuperNumber(int num) {
        int tot = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                tot = tot + i;
            }
        }
        if(tot == num){
            System.out.println(num+" is super");
        }else{
            System.out.println(num+" is not super");
        }

    }

    public static void main(String[] args) {
        SuperNumber superNumber = new SuperNumber();
        superNumber.isSuperNumber(496);
    }
}
