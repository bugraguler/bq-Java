package com.classes.javainterviewprep;

public class ArrayBasic {
    public static void main(String[] args) {
        int[][] array = {
                {2332,99,70},
                {1236,66},
                {55,35,35,24},
                {21}
        };
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
