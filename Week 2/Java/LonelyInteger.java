package org.week2;

import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {
        // Test Cases
        System.out.println(lonelyinteger(List.of(1, 1, 2))); // 2
    }
    public static int lonelyinteger(List<Integer> a) {

        int n = a.size();
        int result = 0;

        if (n > 1 && n < 100) {
            for (int i = 0; i < n ; i++) {
                result ^= a.get(i);
            }
        } else {
            result = a.get(0);
        }
        return result;
    }
}
/*
    Time Complexity: O(n)
    Space Complexity: O(1)
    Given an array of integers, where all elements but one occur twice, find the unique element.
*/