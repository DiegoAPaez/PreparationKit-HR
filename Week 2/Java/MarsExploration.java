package org.week2;

public class MarsExploration {
    public static void main(String[] args) {
        // Test cases
        String s = "SOSSPSSQSSOR";
        System.out.println(marsExploration(s));
    }

    public static int marsExploration(String s) {
        int changedLetters = 0;
        int messages = s.length() / 3;
        String sos = "SOS";
        for (int i = 0; i < messages; i++) {
            String subString = s.substring(i * 3, i * 3 + 3);
            System.out.println(subString);
            for (int j = 0; j < 3; j++) {
                if (subString.charAt(j) != sos.charAt(j)) {
                    changedLetters++;
                }
            }
        }
        return changedLetters;
    }
}

/*
A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the
signal received by Earth as a string, s, determine how many letters of the SOS message have been changed by radiation.

Function Description
Complete the marsExploration function in the editor below.
marsExploration has the following parameter(s):
string s: the string as received on Earth

Returns
int: the number of letters changed during transmission

Input Format
There is one line of input: a single string, s.
*/
