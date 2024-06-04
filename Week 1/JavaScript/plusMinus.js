function plusMinus() {
  arr = [1, 1, 0, -1, -1];
  let positive = 0;
  let negative = 0;
  let zero = 0;
  let len = arr.length;

  for (let i = 0; i < len; i++) {
    if (arr[i] > 0) {
      positive++;
    } else if (arr[i] < 0) {
      negative++;
    } else {
      zero++;
    }
  }

  if (positive > 0) {
    positive = positive / len;
  }
  if (negative > 0) {
    negative = negative / len;
  }
  if (zero > 0) {
    zero = zero / len;
  }

  console.log(positive.toFixed(6));
  console.log(negative.toFixed(6));
  console.log(zero.toFixed(6));
}

plusMinus();

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Function Description
Complete the plusMinus function in the editor below.
plusMinus has the following parameter(s):
int arr[n]: an array of integers

Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a
separate line with 6 digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer n, the size of the array.
The second line contains n space-separated integers that describe arr[n].

Constraints

0 < n <= 100
-100 <= arr[i] <= 100

*/
