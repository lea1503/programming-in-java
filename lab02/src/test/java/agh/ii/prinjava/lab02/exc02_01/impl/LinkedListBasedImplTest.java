package agh.ii.prinjava.lab02.exc02_01.impl;


import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newStackIsEmpty() {
        assertTrue(stackOfInts.isEmpty());
    }

    @Test
    void test_push(){
        stackOfInts.push(2);
        stackOfInts.push(10);
        assertEquals(10, stackOfInts.peek());
        assertEquals(2, stackOfInts.numOfElems());

    }

    @Test
    void test_pop() {
        stackOfInts.push(5);
        assertEquals(5, stackOfInts.pop());
    }

}
