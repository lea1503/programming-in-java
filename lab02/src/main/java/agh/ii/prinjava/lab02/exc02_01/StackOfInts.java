package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {

    /**
     * pop is a method to add an element at the first place of the stack
     * @return integer, the value of the added element
     */
    int pop();

    /**
     * push is a method to delete the first element of the stack
     * @param x, the value of the deleted element
     */
    void push(int x);

    /**
     * isEmpty is a method to check if the stack is empty or not
     * @return 0
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * numOfElems is a method to display the length of the stack
     * @return integer
     */
    int numOfElems();

    /**
     * peek is a method that displays the value of the first element of the stack
     * @return integer
     */
    int peek();
}
