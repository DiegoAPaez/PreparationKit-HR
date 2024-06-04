package org.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;
        Collections.sort(arr);

        for (int i = 0; i < 4; i++){
            if (arr.get(i) >= 1 && arr.get(i) <= Math.pow(10, 9)){
                min += arr.get(i);
            }
        }
        for (int i = 1; i < 5; i++) {
            if (arr.get(i) >= 1 && arr.get(i) <= Math.pow(10, 9)) {
                max += arr.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
}
/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated
long integers.

Example
arr = [1,3,5,7,9]
The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9 = 24. The function prints 16 24

Function Description
Complete the miniMaxSum function in the editor below.
miniMaxSum has the following parameter(s):
arr: an array of 5 integers

Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.

Input Format
A single line of five space-separated integers.

Constraints
1 <0 arr[i] <= 10^9

Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be
calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
*/