package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * pushTest verifies if the push method works well
     * and if the peek method works well.
     */

    @Test
    void pushTest(){
        stackOfInts.push(5);
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek());
    }

    /**
     * popTest verifies is the pop method works well.
     */

    @Test
    void popTest(){
        stackOfInts.push(5);
        stackOfInts.push(10);
        assertEquals(10, stackOfInts.pop());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     */

    @Test
    void numOfElemsTest(){
        stackOfInts.push(5);
        stackOfInts.push(10);
        assertEquals(2, stackOfInts.numOfElems());
    }

}