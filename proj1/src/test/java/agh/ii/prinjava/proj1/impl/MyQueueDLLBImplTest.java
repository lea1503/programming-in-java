package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * enqueueTest verifies if enqueue method works well
     * and if peek method is okay.
     */

    @Test
    void enqueueTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.peek());
    }

    /**
     * dequeueTest verifies if dequeue method works well.
     */

    @Test
    void dequeueTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.dequeue());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     */

    @Test
    void numOfElemsTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.dequeue());
        assertEquals(1, queueOfInts.numOfElems());
    }


}