package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    /**
     * Node is a class that defines a node.
     * It allows to construct some linked lists or stacks or queues.
     * We can create a node, to put it into a linked list, stack or queue.
     * We can add it, delete it, return its values, etc.
     * @param <T> It is a generic class of type T (T: type).
     */

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> first = null;
    private Node<E> last = null;
    private int numOfElems = 0;

    /**
     * addFirst is a method that adds an element at the beginning of the linked list.
     * First, we need to create a new node.
     * Then, we need to check if the list is empty, if yes: we initialize its first and last as new node.
     * Finally, if there are at least one element in the list: we need to initialize it as the first node
     * (with its previous and next).
     * @param e, type E. Generic method (E: element).
     */

    public void addFirst(E e) {

        Node<E> new_node = new Node(e, null, null);

        if (first == null) {
            first = new_node;
            last = new_node;
        } else {
            first.prev = new_node;
            new_node.next = first;
            first = new_node;
        }
        numOfElems++;
    }

    /**
     * addLast is a method that adds an element at the end of the linked list.
     * First, we need to create a new node.
     * Then, we need to check if the list is empty, if yes: we initialize its first and last as new node.
     * Finally, if there are at least one element in the list: we need to initialize it as the last node
     * (with its previous and next).
     * @param e, type E.
     */

    public void addLast(E e) {

        Node<E> new_node = new Node(e, null, null);

        if (first == null) {
            first = new_node;

        } else {
            last.next = new_node;
            new_node.prev = last;
        }
        last = new_node;
        numOfElems++;
    }

    /**
     * removeFirst is a method that deletes the first element of the linked list.
     * First, we need to check if the list is empty, if yes: display exception.
     * Then, we need to check if there is only one element of the list, if yes: put directly last and
     * first at null.
     * Finally, if there are more than 1 element: I used a local variable to store the second element (first.next)
     * and put directly last and first of it at null.
     * @return E, value of the deleted element.
     * @throws IllegalStateException if the linked list is empty.
     */
    public E removeFirst() {
        if (first == null) {
            throw new IllegalStateException("Your queue is already empty !");
        } else if (numOfElems == 1) {
            E value = first.elem;
            first = null;
            last = null;

            numOfElems = 0;
            return value;
        } else {
            E value = first.elem;
            Node cmp = first.next;
            first.next = null;
            cmp.next = null;
            first = cmp;

            numOfElems--;
            return value;
        }
    }

    /**
     * removeLast is a method that deletes the last element of the linked list.
     * First, we need to check if the list is empty, if yes: display exception.
     * Then, we need to check if there is only one element of the list, if yes: put directly last and
     * first at null.
     * Finally, if there are more than 1 element: I used a local variable to store the second last one and
     * put directly last and first of it at null.
     * @return E, value of the deleted element.
     * @throws IllegalStateException if the linked list is empty.
     */

    public E removeLast(){
        if (last == null){
            throw new IllegalStateException("Your queue is already empty !");
        }else if (numOfElems == 1){
            E value = last.elem;
            first = null;
            last = null;

            numOfElems = 0;
            return value;
        }else {
            E value = last.elem;
            Node cmp = last.prev;
            last.prev = null;
            cmp.prev = null;
            last = cmp;

            numOfElems--;
            return value;
        }
    }

    /**
     * peek is a method that displays the value of the first element or of the last element of the linked list.
     * @param n, type integer. It has as a boolean function. If it is 0, it returns the value of the first element
     *           if it is 1, it returns the value of the last element. Notice that this boolean is not very useful
     *           but we can do this like this to use it easily for testing.
     * @return E, the value of first or last element in the linked list.
     */

    public E peek(int n) {
        if (n==1) {
            return first.elem;
        } else  {
            return last.elem;
        }
    }

    /**
     * toString is a method that displays all information (first element, last element, number of elements)
     * of the linked list.
     * @return String.
     */

    @Override
    public String toString() {
        return "DLinkList{" +
                "first=" + first.elem +
                ", last=" + last.elem +
                ", numOfElems=" + numOfElems +
                '}';
    }

    /**
     * numOfElems is a method that returns the number of element in the linked list.
     * @return integer.
     */

    public int numOfElems() {
        return numOfElems;
    }
}
