package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {

    /**
     * pop is a method that deletes an element at the beginning of the stack.
     * @return E, generic type. The value of the deleted element.
     */
    E pop();

    /**
     * push is a method that adds an element at the beginning of the stack.
     * @param x, generic type E, the value of the added element.
     */
    void push(E x);

    /**
     * isEmpty is a boolean method that restart numOfElems at 0 if the queue is empty.
     * @return boolean. If isEmpty, then numOfElems is equal to 0.
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * numOfElems is a method that returns the number of element in the queue.
     * @return integer.
     */
    int numOfElems();

    /**
     * peek is a method that returns the value of the first element of the stack.
     * @return E, generic type.
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
