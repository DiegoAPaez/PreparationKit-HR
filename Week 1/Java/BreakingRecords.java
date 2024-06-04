package org.week1;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = 0;
        int max = 0;

        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < scores.size(); i++) {
            if(i == 0) {
                min = scores.get(i);
                max = scores.get(i);
            } else {
                if(scores.get(i) < min) {
                    min = scores.get(i);
                    minCount++;
                } else if(scores.get(i) > max) {
                    max = scores.get(i);
                    maxCount++;
                }
            }
        }
        List<Integer> results = new ArrayList<>();
        results.add(maxCount);
        results.add(minCount);
        return results;
    }
}
