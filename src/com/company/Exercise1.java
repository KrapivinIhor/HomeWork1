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
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter ArrLength");
        int arr_length = scn.nextInt();
        System.out.println("Please Enter how many elements should be transit to the end");
        int numberOfElements = scn.nextInt();
        int[] arr = new int[arr_length];
        System.out.println("Please Enter Array ");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Array is " + Arrays.toString(arr));

        int[] new_arr1 = new int[numberOfElements];
        int count = 0;

        for (int i = 0; i < numberOfElements ; i++) {
              new_arr1[count] = arr[i];
              count++;
        }

        System.out.println(Arrays.toString(new_arr1));

        int[] new_arr2 = new int[arr.length];
        System.arraycopy(arr,numberOfElements,new_arr2,0,arr.length-numberOfElements);
        System.out.println(Arrays.toString(new_arr2));

        System.arraycopy(new_arr1,0,new_arr2,numberOfElements + 2,numberOfElements);
        System.out.println(Arrays.toString(new_arr2));



    }
}
