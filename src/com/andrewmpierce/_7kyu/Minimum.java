package com.andrewmpierce._7kyu;

import java.util.Arrays;

// Smallest number combined with input, ignoring duplicates.

public class Minimum {
    public static int minValue(int[] values){
        Integer[] sortingArray = new Integer[0];
        for (int i = 0; i < values.length; i++) {
            if (!Arrays.asList(sortingArray).contains(values[i])) {
                sortingArray = Arrays.copyOf(sortingArray, sortingArray.length + 1);
                sortingArray[sortingArray.length - 1] = values[i];
            }
        }
        Arrays.sort(sortingArray);
        String result = "";
        for (int i = 0; i < sortingArray.length; i++) {
            result += sortingArray[i];
        }
        return Integer.parseInt(result);
    }
}
