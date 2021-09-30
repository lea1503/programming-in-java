package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRecord(){

        HelloJavaRecord hjr = new HelloJavaRecord(1, "abc");
        assertEquals(1, hjr.i1());
        assertEquals("abc", hjr.s1());

    }
}