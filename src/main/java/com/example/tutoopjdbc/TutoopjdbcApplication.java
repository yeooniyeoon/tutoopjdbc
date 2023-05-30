package com.example.tutoopjdbc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutoopjdbcApplication {
    public static void main(String[] args) {
//        printcheckLeapYear();

        game369();
    }

    private static void game369() {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.print(cnt + "");
            int a = cnt / 10;
            int b = cnt % 10;
            if (a % 3 == 0 && a != 0)
                System.out.print("*");
            if (b % 3 == 0 && b != 0)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printcheckLeapYear(String[] args) {
        int i = 1700;
        if (checkLeapYear(i))
            System.out.println(i + " O");
        else
            System.out.println(i + " O");
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return false;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static String is369(int cnt) {
        int a = cnt /10;
        int b = cnt %10;
        String str = (b % 3 == 0 && b != 0) ? "*" : "";
        if (a == 0)
            return str;

        return str + is369(a);
    }
}
