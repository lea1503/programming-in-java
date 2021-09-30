package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void Test_area_perimeter_rect() {

        Rectangle rectangle = new Rectangle(2,5,true);
        assertEquals(10, rectangle.area());
        assertEquals(14, rectangle.perimeter());
    }

}