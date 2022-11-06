package basic_java_questions;

import java.util.Arrays;

public class MinMaxNumbersinAnArray {
    public static void main(String[] args) {

        /*
         * Write a method that accepts an integer array as input and prints
         * the minimum and the maximum numbers from given array
         *
         * Input : {-1,3,2,5,4,1,6,-2}
         *
         * Output :
         *
         * min: 1
         *
         * max: 6
         */

        int[] arr ={-1,3,2,5,4,1,6,-2};

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println("min number is:  " + min +
                            "\nmax number is:   " + max);
    }
}
