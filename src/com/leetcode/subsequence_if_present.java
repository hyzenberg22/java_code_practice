package com.leetcode;

import java.util.ArrayList;

public class subsequence_if_present {
    static boolean sub_sum_if(int indx, int arr_sum, int[] arr, int arr_siz, ArrayList<Integer> ds, int find_sum) {
        if (indx == arr_siz) {
            if (find_sum == arr_sum) {
                for (int x : ds) System.out.print(x + " ");
                System.out.println();
                return true;
            } else return false;
        }

        //if the picking is happened
        ds.add(arr[indx]);
        arr_sum += arr[indx]; // we are adding it to the variable sum
        if (sub_sum_if(indx + 1, arr_sum, arr, arr_siz, ds, find_sum)) return true;

        //if the picking is not happend
        arr_sum -= arr[indx]; //deducting from the actual sum
        ds.remove(ds.size() - 1);
        if (sub_sum_if(indx + 1, arr_sum, arr, arr_siz, ds, find_sum)) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 2};
        int find_sum = 2;
        int arr_siz = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        int index = 0;
        int arr_sum = 0;

        boolean b = sub_sum_if(index, arr_sum, arr, arr_siz, ds, find_sum);
        System.out.println(b);
    }
}
