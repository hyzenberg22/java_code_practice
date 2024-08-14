package com.leetcode;

import java.util.ArrayList;

public class all_kind_of_patterns {
    static void sub_sum(int indx, int arr_sum, int[] arr, int arr_siz, ArrayList<Integer> ds, int find_sum) {
        if (indx == arr_siz) {
            if (find_sum == arr_sum) {
                for (int x : ds) System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        //if the picking is happened
        ds.add(arr[indx]);
        arr_sum += arr[indx]; // we are adding it to the variable sum
        sub_sum(indx + 1, arr_sum, arr, arr_siz, ds, find_sum);

        //if the picking is not happend
        arr_sum -= arr[indx]; //deducting from the actual sum
        ds.remove(ds.size() - 1);
        sub_sum(indx + 1, arr_sum, arr, arr_siz, ds, find_sum);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1, 1, 2};
        int find_sum = 2;
        int arr_siz = arr.length;
        ArrayList<Integer> ds = new ArrayList();
        int index = 0;
        int arr_sum = 0;

        sub_sum(index, arr_sum, arr, arr_siz, ds, find_sum);
    }
}
