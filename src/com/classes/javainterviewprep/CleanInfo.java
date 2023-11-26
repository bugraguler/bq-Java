package com.classes.javainterviewprep;

public class CleanInfo {
    public static void cleanString(String str) {
        str = str.replaceAll("[^(A-Za-z0-9)]", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(i);
                break;
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        CleanInfo.cleanString("aACchd988923^&+/+asdf34");
    }
}
