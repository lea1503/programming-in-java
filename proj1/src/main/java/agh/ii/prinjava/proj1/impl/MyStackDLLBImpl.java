package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * elems has as type DLinkList<E>. So, we can use the corresponding methods that I've already created
 * in the DlinkList.
 */

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * pop is a method that deletes the first element of the stack.
     * @return E, value of the deleted element.
     * @throws IllegalStateException if the stack is empty.
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * push is a method that adds the first element of the stack.
     * @param x, type E, the value of the added element.
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * numOfElems is a method that returns the number of element in the stack.
     * @return integer.
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     * peek is a method that displays the value first element of the stack.
     * Here I put 1 in the peek method because I'm interested with the first element.
     * @return E.
     */
    @Override
    public E peek() {
        return elems.peek(1);
    }
}
