package com.example.tutoopjdbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TutoopjdbcApplicationTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, TutoopjdbcApplication.checkLeapYear(1700));
    }

    @Test
    void testLeapYear() {
        assertEquals(true, TutoopjdbcApplication.isLeapYear(2020));
        assertEquals(false, TutoopjdbcApplication.isLeapYear(1900));
        assertEquals(true, TutoopjdbcApplication.isLeapYear(2400));
    }

    @Test
    void testis369() {
        assertEquals("*", TutoopjdbcApplication.is369(3));
        assertEquals("", TutoopjdbcApplication.is369(15));
        assertEquals("**", TutoopjdbcApplication.is369(33));
        assertEquals("***", TutoopjdbcApplication.is369(333));
        assertEquals("****", TutoopjdbcApplication.is369(3369));
    }
}