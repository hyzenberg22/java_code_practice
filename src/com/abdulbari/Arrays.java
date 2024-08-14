package com.abdulbari;

import org.ietf.jgss.GSSContext;

public class Arrays {
    public static void sum_arr(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println(sum);
    }
    public static String search_index(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) return String.format("arr found at index:- " + i);
            break;
        }
        return String.format("The Element %d is not present", el);
    }
    public static void max_el_arr(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (max < x) max = x;
        }
        System.out.format("The max Element is :- %d", max);
    }
    public static void second_max_el_arr(int[] arr) {
        int sec_max, max;
        max = sec_max = arr[0];
        for (int x : arr) {
            //Check for the 1st one max case
            if (x > max) {
                sec_max = max;
                max = x;

            } else if (x > sec_max) { // check for the second max case if above is false
                sec_max = x;
            }


        }
        System.out.format("The second Max Element is :- %d", sec_max);
    }

    public static void rotate_arr(int[] arr){
//        2 pointer solution
        for(int i=0,j=arr.length-1; i<j ; i++, j--){
            int temp = 0;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 12, 34, 4, 5};
        rotate_arr(arr);
    }
}
