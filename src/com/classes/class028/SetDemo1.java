package com.classes.class028;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //no dublicates,no insertion orders
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Orange");
        fruits.add("Mandarin");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        fruits.add("Apple");
        System.out.println(fruits);

        TreeSet<String> sortedFruits =new TreeSet<>(fruits);
        System.out.println(sortedFruits);
    }
}
