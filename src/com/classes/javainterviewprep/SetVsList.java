package com.classes.javainterviewprep;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list.size());
        System.out.println(list.get(0));

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(4);
        set.add(6);
        set.add(6);
        set.add(8);
        set.add(8);
        set.add(10);

        System.out.println(set.size());
        System.out.println("**********************************");
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
