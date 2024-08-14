package com.abdulbari;

public class string_p1 {
    public static void main(String[] args) {
//        ----------- From the char array---------------
        char[] char_arr = {'a', 'b', 'c'};
        String str_char = new String(char_arr);

//        -------------- From the Byte Array --------------
        byte[] byte_arr = {65, 66, 67};
        String str_byte = new String(byte_arr);

//        -----------------From the String------------------
        String str = new String("java");

        System.out.println(str_char + "\n" + str_byte + "\n" + str);

//        ------------------ pool vs heap-------------------
        String str_pool = "this is in pool";
        String str_heap = new String("This is in heap ");

        System.out.println(str_pool + "\n" + str_heap);

    }
}
