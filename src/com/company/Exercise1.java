package com.company;

import java.util.Arrays;
import java.util.Scanner;

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
        int[] fromArray = new int[numberOfElements];
        int count = 0;
        int[] toArray = new int[arr.length];
        System.arraycopy(arr,numberOfElements,toArray,0,arr.length-numberOfElements);
        System.arraycopy(arr,0,toArray,toArray.length - numberOfElements,numberOfElements);
        return toArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotationOfTheArray(15,3,
                new int[]{5, 6, 1, 2, 6, 5, 6, 1, 2, 6, 5, 6, 1, 2, 6})));
    }
}
