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
     * First, we try to add 2 new nodes in my list.
     * I use the assertEquals method to check it. I'm expected to have 5 because
     * peek returns the first element of the list, and I used addFirst method to add them.
     * So, first I add "10" to the first place, then I add "5" to the first place.
     * So, I have "5" then "10" in my list.
     */

    @Test
    void addTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(5, dLinkList.peek(1));
    }

    /**
     * addTest2 verifies if the addLast method works well.
     * First, I add 3 new nodes to the last place in my list.
     * So, I'm expected to have "20" because peek returns here the last element of my list.
     * Now, order in my list : "5", "10", "20"
     * Notice that I can also use peek(1), in this way I'm expected to have "5".
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
     * First, I add 2 new elements.
     * The current order is following: "5", "10" because I used addFirst method.
     * I want to remove the first element, so "5".
     */

    @Test
    void removeTest(){
        dLinkList.addLast(5);
        dLinkList.addLast(10);
        assertEquals(5, dLinkList.removeFirst());
    }

    /**
     * removeTest2 verifies if the removeLast method works well.
     * First, I add 2 new elements.
     * The current order is following: "5", "10" because I used addFirst method.
     * I want to remove the first element, so "10".
     */
    @Test
    void removeTest2(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(5);
        assertEquals(10, dLinkList.removeLast());
    }

    /**
     * numOfElemTest verifies if the numOfElems method works well.
     * First, I add 2 new elements.
     * The current order is following: "5", "10" because I used addFirst method.
     * Then, I remove the last element. So, the current order is now: "5".
     * So, I'm expected to have only one element in my list.
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
     * First, I add 3 new elements in my list.
     * I just want to display some information according the toString method.
     * The order in my list is following: "3", "2", "10".
     */
    @Test
    void toStringTest(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        assertEquals("DLinkList{first=3, last=10, numOfElems=3}",dLinkList.toString());
    }

}