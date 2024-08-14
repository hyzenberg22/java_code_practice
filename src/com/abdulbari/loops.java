package com.abdulbari;

import java.util.Scanner;

public class loops {

    public static void number_table(int x) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("The table of %d X %d is:- %d \n", x, i, x * i);

        }
    }

    public static void sum_of_n(int n) {
        int tot_sum = 0;
        while (n > 0) {
            tot_sum += n;
            n--;
        }
        System.out.println(tot_sum);
    }

    public static int rec_factorial_num(int fact) {
        if (fact == 0 || fact == 1) return 1;
        else return fact * rec_factorial_num(fact - 1);
    }

    public static int loop_factorial_num(int l) {
        int x = 1;
        for (int i = 1; i <= l; i++) {
            x = x * i;
        }
        return x;
    }

    public static void display_number(int num) {
        int counter = 0;
        do {

            System.out.println((int) num % 10);
            num = num / 10;
            counter++;
        } while (num > 0);

        System.out.println("The total count of digits in the number --> " + counter);

    }

    public static void amstrong_number(int num) {
        int ams_no = 0;
        int back_no = num;
        do {
            int mod = (int) Math.pow(num % 10, 3);
            ams_no += mod;
            num = num / 10;
        } while (num > 0);

        if (ams_no == back_no) System.out.println(back_no + " Amstrong Number");
        else System.out.println(back_no + " Not Armstrong Number");
    }

    public static void reverse_num(int num) {
        int rev = 0;
        do {
            int mod = num % 10;
            num = num / 10;
            rev = (rev * 10) + mod;
        } while (num > 0);
        System.out.println(rev);
    }

    public static String get_word_number(int x) {
        if (0 <= x || x <= 10) {
            switch (x) {
                case 1:
                    return "One";
                case 2:
                    return "Two";
                case 3:
                    return "Three";
                case 4:
                    return "Four";
                case 5:
                    return "Five";
                case 6:
                    return "Six";
                case 7:
                    return "Seven";
                case 8:
                    return "Eight";
                case 9:
                    return "Nine";
                case 0:
                    return "Zero";
                default:
                    return "Not a valid number";
            }

        } else return "Number is Out of Range plese try 0 to 9";
    }

    public static void number_spell(int num) {

        int no = 0;
        String str = new String("");
        do {
            int mod = num % 10;
            num = num / 10;
            str = get_word_number(mod) + " " + str;
        }
        while (num > 0);
        System.out.println(str);
    }

    public static void palindrom_no(int num) {
        int rev = 0;
        int original = num;
        do {
            int mod = num % 10;
            num = num / 10;
            rev = (rev * 10) + mod;
        } while (num > 0);
        if (rev == original) System.out.println("It's a Palindrom");
        else System.out.println("Not a Palindrom");
    }

    public static void AP_series(int start, int common_dif, int to_n) {
        System.out.format("Ap Series of %d till %d are :-> ", start, to_n);
        do {
            System.out.print(" " + start);
            start += common_dif;
            to_n--;
        } while (to_n > 0);
    }

    public static void GP_series(int start, int ratio, int till_n) {

        if (ratio != 0 && start != 0 && till_n > 0) {
            System.out.format("GP Series of %d till %d are :-> ", start, till_n);
            do {
                System.out.print(" " + start);
                start *= ratio;
                till_n--;
            } while (till_n > 0);
        } else System.out.println("Ratio/start can't be Zero");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String str = sc.next();

        int[] arr = {1, 12, 34, 4, 5};
        System.out.println(arr.length);

    }

}
