package org.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
    // Sample input of 20 elements
    List<Integer> arr = Arrays.asList(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67);
    List<Integer> sorted = countingSort(arr);
    System.out.println(sorted);

    }
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] count = new int[100];
        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }

        for (int i = 0; i < count.length; i++) {
            sorted.add(count[i]);
        }
        return sorted;
    }
}

/*
Alternative Sorting
Another sorting method, the counting sort, does not require comparison. Instead, you create an integer
array whose index range covers the entire range of values in your array to sort. Each time a value occurs
in the original array, you increment the counter at that index. At the end, run through your counting array,
printing the value of each non-zero valued index that number of times.

Challenge
Given a list of integers, count and return the number of times each value appears as an array of integers.

Function Description
Complete the countingSort function in the editor below.
countingSort has the following parameter(s):
arr[n]: an array of integers

Returns
int[100]: a frequency array
*/