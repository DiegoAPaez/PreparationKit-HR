def plusMinus() :
    arr = [-4, 3, -9, 0, 4, 1];
    positive = 0;
    negative = 0;
    zero = 0;

    for x in arr: 
        if (x > 0):
            positive+=1;
        elif (x < 0):
            negative+=1;
        else:
            zero+=1;

    if (positive > 0):
        print("{:.6f}".format(positive/len(arr)));
    if (negative > 0):
        print("{:.6f}".format(negative/len(arr)));
    if (zero > 0):
        print("{:.6f}".format(zero/len(arr)));

plusMinus();

#Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
#Print the decimal value of each fraction on a new line with 6 places after the decimal.

#Function Description
#Complete the plusMinus function in the editor below.
#plusMinus has the following parameter(s):
#int arr[n]: an array of integers

#Print
#Print the ratios of positive, negative and zero values in the array. Each value should be printed on a
#separate line with 6 digits after the decimal. The function should not return a value.

#Input Format

#The first line contains an integer n, the size of the array.
#The second line contains n space-separated integers that describe arr[n].

#Constraints

#0 < n <= 100
#-100 <= arr[i] <= 100
