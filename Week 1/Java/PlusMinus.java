package org.week1;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        // Sample input
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(5);
        arr.add(-7);
        arr.add(0);

        // Variables
        int n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        float positiveRatio = 0;
        float negativeRatio = 0;
        float zeroRatio = 0;

        // Count positive, negative, and zero values
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        if (positive > 0) {
            positiveRatio = (float) positive / n;
        }
        if (negative > 0) {
            negativeRatio = (float) negative / n;
        }
        if (zero > 0) {
            zeroRatio = (float) zero / n;
        }

        // Output
        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }
}


/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Function Description
Complete the plusMinus function in the editor below.
plusMinus has the following parameter(s):
int arr[n]: an array of integers

Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a
separate line with 6 digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer n, the size of the array.
The second line contains n space-separated integers that describe arr[n].

Constraints

0 < n <= 100
-100 <= arr[i] <= 100

*/