package com.company;

/*Ranges

Given a sorted integer array. Print all ranges in which each next element is increased by one. The range is defined its minimal and maximal values. If the range contains one element print only its value.

Input
{array_length}
{array_values}

Output
[{min_range1} {max_range1}]...[{min_rangeN} {max_rangeN}]

Example
Input
11
1 2 3 5 8 9 10 13 14 15 16

Output
[1 3][5][8 10][13 16]
*/

public class Exercise3 {
    public static void rangesOfArray(int length, int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        int minElementOfTheRange = arr[0];
        int maxElementOfTheRange;

        for (int i = 1; i < length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                maxElementOfTheRange = arr[i - 1];
                if (maxElementOfTheRange == minElementOfTheRange) {
                    stringBuilder.append("[").append(minElementOfTheRange).append("]");
                } else {
                    stringBuilder.append("[").append(minElementOfTheRange).append("..").append(maxElementOfTheRange).append("]");
                }
                minElementOfTheRange = arr[i];
            }
        }
        if (arr[length - 1] - arr[length - 2] == 1) {
            stringBuilder.append("[").append(minElementOfTheRange).append("..").append(arr[length - 1]).append("]");
        } else {
            stringBuilder.append("[").append(arr[length - 1]).append("]");
        }

        System.out.println("Ranges are:" + stringBuilder.toString());

    }

    public static void main(String[] args) {
        rangesOfArray(11, new int[]{1,2,3,5,8,9,10,13,14,15,16});
          }
}
