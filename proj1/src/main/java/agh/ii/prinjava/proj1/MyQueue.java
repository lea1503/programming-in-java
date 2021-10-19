package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /**
     * enqueue is a method that adds an element at the end of the queue.
     * @param x, generic type E. The value of the added element.
     */
    void enqueue(E x);

    /**
     * dequeue is a method that deletes an element at the beginning of the queue.
     * @return E, generic type, the value of the deleted element.
     */
    E dequeue();

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
     * peek is a method that returns the value of the first element of the queue.
     * @return E, generic type.
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
