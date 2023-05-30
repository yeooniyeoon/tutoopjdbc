package com.example.tutoopjdbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TutoopjdbcApplicationTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, TutoopjdbcApplication.checkLeapYear(1700));
    }
}