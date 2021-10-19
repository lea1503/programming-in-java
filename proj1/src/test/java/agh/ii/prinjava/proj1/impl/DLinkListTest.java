package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * addTest verifies if the addFirst method works well
     * and if peek method is okay.
     */

    @Test
    void addTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(5, dLinkList.peek(1));
    }

    /**
     * addTest2 verifies if the addLast method works well.
     */

    @Test
    void addTest2(){
        dLinkList.addLast(5);
        dLinkList.addLast(10);
        dLinkList.addLast(20);
        assertEquals(20, dLinkList.peek(0));
    }

    /**
     * removeTest verifies if the removeFirst method works well.
     */

    @Test
    void removeTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(5, dLinkList.removeFirst());
    }

    /**
     * removeTest2 verifies if the removeLast method works well.
     */

    @Test
    void removeTest2(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(10, dLinkList.removeLast());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     */

    @Test
    void numOfElemTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(10, dLinkList.removeLast());
        assertEquals(1,dLinkList.numOfElems());
    }

    /**
     * toStringTest verifies if the toString method works well.
     */

    @Test
    void toStringTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        assertEquals("DLinkList{first=3, last=10, numOfElems=3}",dLinkList.toString());
    }

}