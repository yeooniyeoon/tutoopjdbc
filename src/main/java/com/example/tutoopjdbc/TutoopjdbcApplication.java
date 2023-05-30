package com.example.tutoopjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TutoopjdbcApplication {
    public static void main(String[] args) {
        checkLeapYear();
    }

    private static void checkLeapYear() {
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.printf("%d O\n", year);
        else
            System.out.printf("%d X\n", year);
    }
}
