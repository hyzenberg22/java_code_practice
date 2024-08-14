package com.leetcode;

import java.util.HashMap;

public class palindrom {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), t.charAt(i));
        }
        mp.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
