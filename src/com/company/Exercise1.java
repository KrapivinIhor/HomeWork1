package com.company;

import java.util.Arrays;

/*Array Rotation

Given an integer array. Move first k elements to the array end.

Input

{array length} {k}
{array values}

Output
{rotated array}

Example
Input

5 2
5 6 1 2 6

Output

1 2 6 5 6
*/

public class Exercise1 {
    public static int[] rotationOfTheArray(int length, int numberOfElements, int[] arr){
        int[] helperArray = new int[arr.length];
        System.arraycopy(arr, numberOfElements, helperArray, 0, arr.length - numberOfElements);
        System.arraycopy(arr, 0, helperArray, helperArray.length - numberOfElements, numberOfElements);
        return helperArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotationOfTheArray(15, 3,
                new int[]{5, 6, 1, 2, 6, 5, 6, 1, 2, 6, 5, 6, 1, 2, 6})));
    }
}
