package org.week2;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {


    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = arr.size();


        for (int i = 0; i < n; i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(n - i - 1);
        }

        return Math.abs(leftToRight - rightToLeft);
    }
}
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix arr is shown below:
1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 9 + 5 + 3 = 17. Their absolute difference is |15 - 17| = 2.

Function description
Complete the diagonalDifference function in the editor below.
diagonalDifference takes the following parameter:
int arr[n][m]: an array of integers

Return
int: the absolute diagonal difference
 */