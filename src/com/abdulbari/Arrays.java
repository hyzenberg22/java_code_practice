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
    public static void shift_left(int[]arr){
        int temp = arr[0];
        int len = arr.length;
        for( int i=1; i<len; i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        for(int x:arr) System.out.print(Integer.toString(x)+ " ");
    }
    public static void shift_right(int[] arr){
        int len =arr.length;
        int temp = arr[ len-1];
        for(int i=len-1; i>0 ; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int x: arr) System.out.print(Integer.toString(x)+" ");
    }
    public static void insert_el(int[] arr,int el ,int pos){
        int len = arr.length;
        if (pos>len && pos<0) System.out.println("Invalid Element POS");
        else {
            int[] new_arr = new int[len + 1];

            for (int i = 0, j = 0; j < len + 1; i++, j++) {
                if (pos == i) {
                    new_arr[j] = el;
                    j++;
                }
                new_arr[j] = arr[i];
            }

            for (int x : new_arr) System.out.print(Integer.toString(x) + " ");
        }

    }
    public static void delete_el(int[] arr, int pos){
        int len = arr.length;
        for(int i=pos-1; i<=len; i++){
            arr[i]=arr[i+1];
        } 
        arr[len-1]=0;
        for(int x: arr) System.out.println(Integer.toString(x)+" ");
    }
    public static boolean prime_not(int num ){
        for(int i=2; i<(num/2); i++){
            if(num%i==0){
                return false;
            }
            break;
        }
        return true;
    }
    public static int GCD(int x, int y){
        while (x != y) {
            if (x > y) x = x - y;
            else y = y - x;

        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 34, 4, 5};
        int[] long_arr= {3,9,7,8,12,6,15,5,4,10};
//        System.out.println(prime_not(4));
        System.out.println(GCD(11,48));

    }
}
