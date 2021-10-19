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
     * First, I add 2 elements in my stack like addFirst method because it is a stack.
     * The current order is: "2", "5".
     * I'm expected to have 2 because peek returns the first element in the stack.
     */

    @Test
    void pushTest(){
        stackOfInts.push(5);
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek());
    }

    /**
     * popTest verifies is the pop method works well.
     * First, I add 2 elements in my stack like addFirst method because it is a stack.
     * The current order is: "10", "5".
     * I'm expected to have "10" because pop deletes the first element of the stack.
     */

    @Test
    void popTest(){
        stackOfInts.push(5);
        stackOfInts.push(10);
        assertEquals(10, stackOfInts.pop());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     * First, I add 2 elements in my stack like addFirst method because it is a stack.
     * The current order is: "10", "5".
     * So, I'm expected to have 2 elements in my stack.
     */

    @Test
    void numOfElemsTest(){
        stackOfInts.push(5);
        stackOfInts.push(10);
        assertEquals(2, stackOfInts.numOfElems());
    }

}