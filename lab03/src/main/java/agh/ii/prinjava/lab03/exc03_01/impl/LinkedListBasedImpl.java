package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

/**
 * LinkedListBasedImpl is a class implements QueueOfInts.
 * (Enqueue, dequeue, peek, nested class that calls Node).
 */

public class LinkedListBasedImpl implements QueueOfInts {

    /**
     * enqueue is a method to add an element at the end of the queue
     * @param x, integer, value of the added element
     */

    @Override
    public void enqueue(int x) {

        if (isEmpty()){
            first = new Node(x,null, null);
            last = first;
            numOfElems++;
        }
        else{
            Node n = new Node(x,null, null);
            last.prev = n;
            n.next= last;
            last = n;
            numOfElems++;
        }
    }

    /**
     * dequeue is a method to delete the last element of the queue
     * It can return an IllegalStateException if the queue is empty.
     * @return an integer, the value of the delete element
     */

    @Override
    public int dequeue() {
        if (isEmpty()){
            throw new IllegalStateException("Your queue is already empty !");
        }else if(numOfElems == 1){
            int value = first.elem;
            first = null;
            last = null;

            numOfElems = 0;
            return value;
        } else{
            int value = first.elem;
            Node cmp = first.prev;
            first.prev = null;
            cmp.next = null;
            first = cmp;

            numOfElems--;
            return value;
        }
    }

    /**
     * numOfElems is a method to return the number of element in the queue
     * @return integer
     */

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * peek is a method to return the value of the first element of the queue
     * @return, integer
     */

    @Override
    public int peek() {
        return first.elem;
    }

    /**
     * Node is a nested class to create a node (element, next element and previous element).
     * One constructor to create a Node object.
     */

    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node first = null;
    private Node last = null;

    private int numOfElems = 0;
}
