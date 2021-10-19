package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * pop is a method that deletes the first element of the stack.
     * @return E.
     */

    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * push is a method that adds the first element of the stack.
     * @param x, type E.
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
     * @return E.
     */

    @Override
    public E peek() {
        return elems.peek(1);
    }
}
