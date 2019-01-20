package com.company;

import java.util.Arrays;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter the Array Length");
        int length = scn.nextInt();
        int[] arr = new int[length];
        System.out.println("Please Enter Array");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Array is " + Arrays.toString(arr));

        StringBuilder stringBuilder = new StringBuilder();
        int range1 = arr[0];
        int range2;

        for (int i = 1; i < length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                range2 = arr[i - 1];
                if (range2 == range1) {
                    stringBuilder.append("[").append(range1).append("]");
                } else {
                    stringBuilder.append("[").append(range1).append("..").append(range2).append("]");
                }
                range1 = arr[i];
            }
        }
        if (arr[length - 1] - arr[length - 2] == 1) {
            stringBuilder.append("[").append(range1).append("..").append(arr[length - 1]).append("]");
        } else {
            stringBuilder.append("[").append(arr[length - 1]).append("]");
        }

        System.out.println("Ranges are:" + stringBuilder.toString());

    }
}
