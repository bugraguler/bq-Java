package com.classes.javainterviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListCount {
        /*
        Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]
         */

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv"));
        ArrayList<String> outputList = countDeviceNames(inputList);
        System.out.println(outputList);
    }

    public static ArrayList<String> countDeviceNames(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<>();
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : inputList) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                outputList.add(word + count);
                wordCountMap.put(word, count + 1);
            } else {
                outputList.add(word);
                wordCountMap.put(word, 1);
            }
        }

        return outputList;
    }
}

