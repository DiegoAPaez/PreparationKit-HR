package org.week1;

import java.util.Comparator;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        List<Integer> ar = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(divisibleSumPairs(n, k, ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        Comparator cmp = Comparator.comparingInt((Integer o) -> o);
        ar.sort(cmp);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i < j && (ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i<j and ar[i] + ar[j] is divisible by k.

Example
ar = [1, 2, 3, 4, 5, 6]
k = 5
Three pairs meet the criteria: [1,4], [2,3] and [4,6].

Function Description
Complete the divisibleSumPairs function in the editor below.
divisibleSumPairs has the following parameter(s):

int n: the length of array ar
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers, each a value of ar[i].

*/