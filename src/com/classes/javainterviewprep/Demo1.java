package com.classes.javainterviewprep;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String s = "java,selenium,testng,maven";
        System.out.println(Arrays.toString(s.split(",")));
        String[] str = s.split(",");
        for (String ss : str
        ) {
            System.out.print(ss + " ");
        }
        System.out.println("");

        System.out.println("**********************************");

        String les = "This class is easy";
        System.out.println(les.substring(5,11));
        System.out.println(les.indexOf("s",4));
    }
}
