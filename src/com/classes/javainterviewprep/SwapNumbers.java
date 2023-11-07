package com.classes.javainterviewprep;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);


        //swap strings

        String x = "Naber";
        String y = "iyiyim";
        x=x.concat(y);
        System.out.println(x); //Naberiyiyim
        y=x.substring(0,x.length()-y.length());
        System.out.println(y);
        x=x.substring(y.length(),x.length());
        System.out.println(x);


    }
}
