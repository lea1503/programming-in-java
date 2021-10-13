package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import java.util.*;

/**
 * class related to the arrays of integer
 * we can add and delete the first element to the array and display its value
 */

public class ArrayBasedImpl implements StackOfInts {

    /**
     * initialisation of the array
     */
    private int[] array = new int[2];

    /**
     * pop is a method to delete the first element of the list.
     * if the list of stack is empty, we can't delete anything, therefore the program can throw an IllegalStateException.
     * @return integer, the value of the deleted element
     */

    @Override
    public int pop() {

        if (array.length <= 0){
            throw new IllegalStateException("Your stack is already empty !");

        }else {
            //create a lower tab
            int[] arrayB = new int[array.length-1];

            for (int i=1; i< array.length; i++){
                arrayB[i-1] = array[i];
            }
            int deleted_nb = array[0];

            array = arrayB;

            numOfElems--;
            return deleted_nb;
        }

    }

    /**
     * push is a method to put an element at the beginning on the list
     * @param x, the value of the added element
     */

    @Override
    public void push(int x) {

        int[] arrayB = Arrays.copyOf(array, array.length+1);

        for (int i=0; i< array.length; i++){
            arrayB[i+1] = arrayB[i];
        }
        arrayB[0] = x;
        array = arrayB;

        numOfElems++;
    }

    /**
     * numOfElems is a method to display the length of the list
     * @return integer
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * peek is a method to display the value of the first element of the list
     * @return integer
     */
    @Override
    public int peek() {
        return array[0];
    }

    private int numOfElems = 0;
}
