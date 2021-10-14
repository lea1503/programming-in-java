package agh.ii.prinjava.lab03.exc03_01;

/**
 * Interface QueueOfInts.
 */

public interface QueueOfInts {

    /**
     * enqueue is a method to add an element at the end of the queue
     * @param x, integer, value of the added element
     */
    void enqueue(int x);

    /**
     * dequeue is a method to delete the last element of the queue
     * It can return an IllegalStateException if the queue is empty.
     * @return an integer, the value of the delete element
     */
    int dequeue();

    /**
     * isEmpty is a method to know if the queue is empty or not.
     * @return boolean
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * numOfElems is a method to return the number of element in the queue
     * @return integer
     */
    int numOfElems();

    /**
     * peek is a method to return the value of the first element of the queue
     * @return, integer
     */
    int peek();
}
