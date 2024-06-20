package org.week3;

import java.util.List;

public class SubarrayDiv {
    public static void main(String[] args) {
        List<Integer> s = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        System.out.println(birthday(s, d, m));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
/*
Two children, Kelly and Matt, want to share a chocolate bar. Each of the squares has an integer on it.

Kelly decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Matts's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example
s = [2,2,1,3,2]
d = 4
m = 2

Kelly wants to find segments summing to Matts's birth day, d = 4 with a length equalling his birth month, m = 2.
In this case, there are two segments meeting her criteria: [2,2] and [1,3].

Function Description
Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Matt's birth day
int m: Matt's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer n, the number of squares in the chocolate bar.
The second line contains n space-separated integers s[i], the numbers on the chocolate squares where 0 <= 1 < n.
The third line contains two space-separated integers, d and m, Matt's birth day and his birth month.
 */