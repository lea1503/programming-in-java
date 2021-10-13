package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * class related to the stacks of integer as a linked lists
 * we can add and delete the first element to the list and display its value
 * it's a linked list of stack
 */

public class LinkedListBasedImpl implements StackOfInts {

    private Node firstElement;

    /**
     * pop is a method to delete the first element of the stack.
     * if the stack is empty, we can't delete anything, therefore the program can throw an IllegalStateException.
     * @return integer, the value of the deleted element
     */

    @Override
    public int pop() {
        if (isEmpty()){
            throw new IllegalStateException("Your stack is already empty !");
        }else{
            int value = firstElement.elem;
            firstElement = firstElement.next;
            numOfElems--;
            return value;
        }

    }

    /**
     * push is a method to add an element at the beginning of the stack
     * @param x, integer, the value of the added element
     */

    @Override
    public void push(int x) {
        Node n = new Node(x);
        n.next = firstElement;
        firstElement = n;
        numOfElems++;
    }

    /**
     * numOfElems is a method to display the length of the stack
     * @return integer
     */

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * peek is a method to display the value of the first element
     * @return integer
     */

    @Override
    public int peek() {
        return firstElement.elem;
    }

    /**
     * nested class to define the node of an element of a stack (a value and a next)
     */

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private int numOfElems = 0;

}
