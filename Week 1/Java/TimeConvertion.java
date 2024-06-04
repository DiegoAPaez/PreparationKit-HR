package org.week1;

public class TimeConvertion {
    public static void main(String[] args) {

    }
    public static String timeConversion(String s) {
        String[] time = s.split(":");
        String hour = time[0];
        String minute = time[1];
        String second = time[2].substring(0, 2);
        String amOrPm = time[2].substring(2, 4);

        if (amOrPm.equals("PM") && !hour.equals("12")) {
            hour = String.valueOf(Integer.parseInt(hour) + 12);
        } else if (amOrPm.equals("AM") && hour.equals("12")) {
            hour = "00";
        }

        return hour + ":" + minute + ":" + second;
    }
}
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Example
s = '12:01:00AM'
return '00:01:00'

Function Description
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
string s: a time in 12 hour format
Returns
string: the time in 24 hour format

Input Format

A single string  that represents a time in -hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).
*/