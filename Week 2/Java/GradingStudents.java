package org.week2;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        // Sample Input
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        // Sample Output
        List<Integer> result = gradingStudents(grades);
        for (Integer grade : result) {
            System.out.println(grade);
        }

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38) {
                rounded.add(grade);
            } else {
                int nextMultipleOfFive = (grade / 5 + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    rounded.add(nextMultipleOfFive);
                } else {
                    rounded.add(grade);
                }
            }
        }

        return rounded;
    }
}


/*
University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
John is a professor at the university and likes to round each student's grade according to these rules:
- If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
- If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

Examples
grade = 84 round to 85 (85 - 84 is less than 3)
grade = 29 do not round (result is less than 40)
grade = 57 do not round (60 - 57 is 3 or higher)

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.

Function Description
Complete the function gradingStudents in the editor below.
gradingStudents has the following parameter(s):
int grades[n]: the grades before rounding

Returns
int[n]: the grades after rounding as appropriate

Constraints
1 <= n <= 60
0 <= grades[i] <= 100
*/