package com.classes.javainterviewprep;

public class StringVowel {
    public static void main(String[] args) {
        String str = "Welcome";
        boolean isStrIncludeVowel = false;
        int count = 0;

        if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
            isStrIncludeVowel = true;
        }
        System.out.println("The answer for the question isStrIncludeVowel is " + isStrIncludeVowel);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowel character is " + count);


    }

}
