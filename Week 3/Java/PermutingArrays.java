package org.week3;

import java.util.List;

public class PermutingArrays {
    public static void main(String[] args) {
        // Test cases
        List<Integer> A = List.of(1, 2, 2, 1);
        List<Integer> B = List.of(3, 3, 3, 4);
        System.out.println(twoArrays(5, A, B)); // NO

        List<Integer> C = List.of(2, 1, 3);
        List<Integer> D = List.of(7, 8, 9);
        System.out.println(twoArrays(10, C, D)); // YES
    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(null);
        B.sort(null);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(A.size() - i - 1) < k) {
                return "NO";
            }
        }
        return "YES";
    }
}
/*
There are two n-element arrays of integers, A and B. Permute them into some A' and B' such that the relation A'[i] + B'[i] >= k holds for all i where 0 <= i < n.
There will be q queries consisting of A, B, and k. For each query, return YES if some permutation A', B' satisfying the relation exists. Otherwise, return NO.

Function Description
Complete the twoArrays function in the editor below. It should return a string, either YES or NO.
twoArrays has the following parameter(s):
int k: an integer
int A[n]: an array of integers
int B[n]: an array of integers

Returns
- string: either YES or NO

Input Format
The first line contains an integer q, the number of queries.

The next q sets of 3 lines are as follows:
The first line contains two space-separated integers n and k, the size of both arrays A and B, and the relation variable.
The second line contains n space-separated integers A[i].
The third line contains n space-separated integers B[i].
 */