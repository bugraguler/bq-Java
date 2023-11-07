package com.classes.javainterviewprep;

public class StringMethodsRegEx {
    public static void main(String[] args) {

        //Find out how many alpha characters are present in a string?
        String str = " Hih9898jhjh%%^$%^ oio ";
        str = str.replaceAll("[^A-Za-z0-9@#*&]","");
        System.out.println(str);
        System.out.println("Number of Alpha character is "+str.length());

        System.out.println("************************************************");

        //Find the number of words in a string?
        String myString="Today is Wednesday and it is Java Class";
        String []word=myString.split(" ");
        System.out.println(word.length);
        for (String w:word
             ) {
            System.out.println(w);
        }







    }

}