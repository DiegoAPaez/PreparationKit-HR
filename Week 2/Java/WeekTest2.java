package org.week2;

import java.util.Arrays;
import java.util.List;

public class WeekTest2 {
    public static void main(String[] args) {
        // Test cases
        List<Integer> row1 = Arrays.asList(112, 42, 83, 120);
        List<Integer> row2 = Arrays.asList(56, 125, 56, 49);
        List<Integer> row3 = Arrays.asList(15, 78, 101, 43);
        List<Integer> row4 = Arrays.asList(62, 98, 114, 108);

        List<List<Integer>> matrix = Arrays.asList(row1, row2, row3, row4);
        System.out.println(flippingMatrix(matrix));

    }
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxElement = Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1)),
                        Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1)));
                maxSum += maxElement;
            }
        }
        return maxSum;
    }
}
/*
Carl invented a game involving a 2D matrix where each cell in the matrix contains an integer. He can reverse any of
its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the matrix.
Given the initial configuration of the matrix, help Carl reverse the rows and columns to maximize the sum of the matrix

Function Description
Complete the flippingMatrix function in the editor below.
flippingMatrix has the following parameter(s):
int matrix[n][m]: a 2D array of integers
Returns
int: the maximum sum possible
Input Format
The first line contains an integer q, the number of queries.
Each of the next q sets of lines is as follows:
The first line contains an integer n, the number of rows and columns in the matrix.
Each of the next n lines contains n space-separated integers matrix[i][j].
*/
