/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.active;

import java.util.*;

/**
 *
 * @author USER
 */
public class NonOccuring {
    
    // Generic function to convert an Array to Set
    public static Set<Integer> convertArrayToTreeSet(Integer array[])
    {

        // Create the Set by passing the Array as parameter in the constructor
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(array));

        // Return the converted TreeSet
        return treeSet;
    }
    
    public static int getSmallestNonOccuring(int starter, int arrayLength, Set<Integer> treeSet){

        // Loop through the TreeSet and return the smallest number not found
        for(int i = starter; i < arrayLength + 1; i++){
                if(!treeSet.contains(i))
                        return i;
        }

        // Return the first element if there is no missing number
        return starter;
    }
 
    public static void main(String args[])
    {
        // Integer array
        // Integer[] integerArray = new Integer[]{3, 2, 5, 1, 4, 2};
         Integer[] integerArray = new Integer[]{-2, 1, 3, 6, 4, 1, 2};
        // Integer[] integerArray = new Integer[]{5, -1, -3};


        // Sort the array
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));
        
        // Get and its first element
        int firstElement = integerArray[0];

        // Convert the Array to TreeSet
        Set<Integer> treeSet = convertArrayToTreeSet(integerArray);
        
        // Get the size of the sorted set
        int setSize = treeSet.size();
        
        // Find the missing number 
        int result = getSmallestNonOccuring(firstElement, setSize, treeSet);

        if(result != firstElement)
            System.out.println("The smallest non-occuring numebr is: " + result);
        else
            System.out.println("There is NO non-occuring number");
    }
}
