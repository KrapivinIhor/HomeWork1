package com.company;

import java.util.Arrays;

/*Restore array

Given an unsorted array of positive integers. The array divided into monotone parts in which some elements replaced by negative values. Find missing positive integers in the array. Negative elements can be placed only inside a monotone part.
Negative elements cannot be in neighboring cells.

* monotone part - a sequence where each next number greater(less) than previous. e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.

Input

{array_length}
{array_values}



Output

{restored array}

Example
Input
8
1 2 -1 4 7 6 -2 4

Output
1 2 3 4 7 6 5 4
*/

public class Exercise2 {
    public static int[] resortArray(int length, int[] arr){
        int[] resArray = new int[length];
        for (int i = 0; i < arr.length ; i++) {
            resArray[i] = arr[i];
        }
        for (int i = 0; i < resArray.length ; i++) {
            if (resArray[i] < 0){
                resArray[i] = (resArray[i - 1] + resArray[i + 1])/2;
            }
            else if (resArray[0] < 0){
                resArray[0] = resArray[1] - 1;
            }
            else  if (resArray[resArray.length - 1] < 0) {
                resArray[resArray.length - 1] = resArray[resArray.length - 2] + 1;
            }
        }
        return resArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resortArray(8, new int[]{1, 2, -1, 4, 7, 6, -2, 4})));
    }
}
