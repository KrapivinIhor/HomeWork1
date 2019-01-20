package com.company;

import java.util.Arrays;
import java.util.Scanner;

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
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0){
                arr[i] = (arr[i-1] + arr[i+1])/2;
            }
            else if (arr[0] < 0){
                arr[0] = arr[1] - 1;
            }
            else  if (arr[arr.length-1] < 0) {
                arr[arr.length-1] = arr[arr.length-2] + 1;
            }
            else  if ( arr[i] < 0 && arr[i + 1] < 0 ){
                arr[i] = arr[i + 2] - 2;
                arr[i + 1] = arr[i + 2] - 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
