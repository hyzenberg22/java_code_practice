package com.leetcode;

public class Recursion_AB {
    //Indirect Recursion
    void funA(int n) {
        if (n > 0) {
            System.out.println(n);
            funB(n - 1);
        }
    }

    void funB(int n) {
        if (n > 1) {
            System.out.println(n);
            funA(n / 2);
        }
    }

    static int sum_n(int n) {
        if (n == 0) return 0;
        else return sum_n(n - 1) + n;
    }

    static int fact(int n) {
        if (n == 0 || n == 1) return n;
        else return fact(n - 1) * n;
    }

    static int expo(int m, int n) {
        if (n == 0) return 1;
        return expo(m, n - 1) * m;
    }

    static int p = 1, f = 1;

    int tylor(int x, int n) {
        int r;
        if (n == 0) return 1;
        else {
            r = tylor(x, n - 1);
            p *= x;
            f *= n;
            return r + (p / f);
        }
    }

    static int res = 1;

    int tylor_horner(int x, int n) {
        if (n == 0) return res;
        res = 1 + ((x / n) * res);
        return tylor_horner(x, n - 1);
    }

    int fib(int n) {
//        if(n==1 || n==0) return n;
//        else return fib(n-2)+fib(n-1);
        int t0 = 0, t1 = 1, s = 0;
        for (int i = 2; i < n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }

    int pascals_T(int n, int r) {
        if (r == 0 || n == r) return 1;
        else return pascals_T(n - 1, r - 1) + pascals_T(n - 1, r);
    }

    int nCr(int n, int r) {
        int t1, t2, t3;
        t1 = fact(n);
        t2 = fact(r);
        t3 = fact(n - r);
        return t1 / (t2 * t3);
    }

    void TOH(int disk_number, int tower_A, int tower_B, int tower_C) {
        if (disk_number > 0) {
            TOH(disk_number - 1, tower_A, tower_C, tower_B);
            System.out.println(tower_A + "to" + tower_C);
            TOH(disk_number - 1, tower_B, tower_A, tower_C);
        }
    }

    public static void main(String[] args) {
        System.out.println(expo(2, 5));
    }
}
