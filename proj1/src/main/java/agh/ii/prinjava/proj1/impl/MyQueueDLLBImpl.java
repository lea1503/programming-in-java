package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * elems has as type DLinkList<E>. So, we can use the corresponding methods that I've already created
 * in the DlinkList.
 */

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();


    /**
     * enqueue is a method that adds an element at the end of the queue.
     * @param x, type E, the value of the added element.
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * dequeue is a method that deletes the first element of the queue.
     * @return E, value of the deleted element.
     * @throws IllegalStateException if the queue is empty.
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * numOfElems is a method that returns the number of element in the queue.
     * @return integer.
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }


    /**
     * peek is a method that displays the value of the first element of the queue.
     * Here I put 1 in the peek method because I'm interested with the first element.
     * @return E.
     */
    @Override
    public E peek() {
        return elems.peek(1);
    }

}
