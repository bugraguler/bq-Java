package com.classes.javainterviewprep;

public class StringLowerOrUpperCase {
    public static void main(String[] args) {

        String s = "Welcome to Medpace";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                countUpper++;
            } else {
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    countLower++;
                }
            }
        }
        System.out.println("LowerCase char number is "+countLower);
        System.out.println("UpperCase char number is "+countUpper);

    }
}