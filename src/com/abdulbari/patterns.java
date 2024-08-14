package com.abdulbari;

public class patterns {
    public static void pattern_1(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public static void pattern_2(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i + 1; j <= x + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {


    }
}
