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
     * First, I try to add 2 new elements in my queue.
     * I'm expected to have "10" because the peek function returns the first element.
     * enqueue method is like addLast method because it is a queue.
     */
    @Test
    void enqueueTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.peek());
    }

    /**
     * dequeueTest verifies if dequeue method works well.
     * First, I add 2 new elements in my queue.
     * I'm expected to have "10" because I want to delete the first element.
     * The current order is following: "10", "3".
     */
    @Test
    void dequeueTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.dequeue());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     * First, I add 2 new elements.
     * The current order is following: "10", "3" because I used enqueue method.
     * Then, I remove the first element. So, the current order is now: "3".
     * So, I'm expected to have only one element in my list.
     */
    @Test
    void numOfElemsTest(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(3);
        assertEquals(10,queueOfInts.dequeue());
        assertEquals(1, queueOfInts.numOfElems());
    }


}