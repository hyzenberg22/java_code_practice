package com.abdulbari;

import java.sql.SQLOutput;
import java.util.Scanner;

class NotDivisiableByZeroException extends Exception {
    public NotDivisiableByZeroException(String Message) {
        super(Message);
    }

    ;
}

public class string_class {
    //---------------------------Custom Functions---------------------------
    public static void basic_ops(int x, int y, char ops) throws NotDivisiableByZeroException {
        switch (ops) {
            case 'A':
                System.out.println((int) x + y);
                break;
            case 'B':
                System.out.println((int) x - y);
                break;
            case 'C':
                System.out.println((int) x * y);
                break;
            case 'D':
                if (y == 0) throw new NotDivisiableByZeroException("Can't Divide by zero..!");
                else System.out.println((int) x / y);
                break;
            default:
                break;
        }

    }

    public static void url_analyzer(String url) {
        String protocol = url.substring(0, url.indexOf(":"));
        String domain = url.substring(url.lastIndexOf(".") + 1);
        String web_name = url.substring(url.indexOf(".") + 1, url.lastIndexOf("."));

//        ------------------Finding the protocol wala case -----------------------
        if (protocol.equals("https") || protocol.equals("http")) System.out.println("Hypertext protocol");
        else if (protocol.equals("fttp")) System.out.println("Ftp server protocol");
        else System.out.println("Unknown Protocol----> " + protocol);

//        -------------------Handeling the Domain wala case------------
        if (domain.equals("com")) System.out.println("Commercial Domain");
        else if (domain.equals("gov")) System.out.println("Goverment Domain");
        else if (domain.equals("in")) System.out.println("International Domain");
        else System.out.println("Some Unknown Domain ----> " + domain);

        System.out.println("the website name is :- " + web_name);

    }

    public static void day_counter(int day) {
        if (day < 0 || day > 7) System.out.println("Invslid Date press 1-7");
        if (day == 1) System.out.println("monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid number");

    }

    public static char grade(int[] marks) {
        int average = 0;
        for (int mark : marks) {
            average += mark;
        }
        average = average / marks.length;
        if (average < 60) return 'C';
        else if (average >= 60 && average < 80) return 'B';
        else if (average >= 80 && average <= 100) return 'A';
        else return 0;
    }

    public static void odd_even(int x) {
        if (x % 2 == 0) System.out.println("even");
        else System.out.println("Odd");
    }

    public static void age_calc(int age) {
        if (age <= 0 || age > 110) System.out.println("Invalid age");
        else if (age <= 14) System.out.println("Teen");
        else if (age >= 14 && age <= 55) System.out.println("Adult");
        else if (age >= 55 && age <= 125) System.out.println("OLD");
    }
//-----------------------------Main Function ----------------------------

    public static void main(String[] args) throws NotDivisiableByZeroException {
//        -----find the number is odd or even----
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        int[] marks = {60, 45, 90};

//        int data = sc.nextInt();
//        day_counter(data);
//        url_analyzer("https:www.google.com");


        System.out.println("give 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose an Option A--> Sum B--> Substract C--> Multiply D --> Substract");
        char c = sc.next().charAt(0);
        basic_ops(a, b, c);


    }

}
