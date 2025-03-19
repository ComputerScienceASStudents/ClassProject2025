/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classLessons;

import java.util.ArrayList;

/**
 *
 * @author franz
 */
public class SearchingTest {
    
    public SearchingTest() {
        
        String[] arr = {
            "William", "Kurt", "Alan",
            "Franz", "Kaleb", "Neal",
            "Orion", "Tristan", "Cam", 
            "Teddy", "Finlay", "Yevheniia",
            "Thomas", "Hunter", "Nathaniel",
            "Izen", "Jonah", "Wachs", "jaja"
        };
        
        //item to search for
        String item = "jaja";
        
        //simple search
        boolean result = search(arr, item);
        
        //display result
        if (result) {
            System.out.println("found item");
        }
        else {
            System.out.println("not found");
        }
        
        
        //detailed search
        int index = linearSearch(arr, item);
        
        //result display
        System.out.println("linear search found item at " + index);
        
        //<> <-- generics
        ArrayList list = new ArrayList<>();
        
        //fill it with love
        for (String arr1 : arr) {
            list.add(arr1);
        }
        
        //use built in arraylist methods
        result = list.contains(item);
        
        
        //display
        if (result) {
            System.out.println("list has " + item);
        }
        else {
            System.out.println("list doesnt hae " + item);
        }
        list.indexOf(arr);
        
        ////////////////////////////////////////////////////////////////////////
        // NOTE: further resources for searching can be found here:
        //  - My video playlist on searching: https://bit.ly/4bN2dbu
        //  - My presentation on searching: https://bit.ly/3FonaxA
        //  - My assignment on searching: https://bit.ly/4269gZy
        //  - My review sheet on searching: https://bit.ly/3FqTgZr
        //  - Some other websites that go over searching:
        //     - https://bit.ly/4hCIFIe
        //     - https://bit.ly/4iu3WFa
        //     - https://bit.ly/4iK8ZkE
        //     - https://bit.ly/3FtFAwV
        //     - https://bit.ly/4bOFITC
        ////////////////////////////////////////////////////////////////////////
    }

    /**
     * A simple search, determines if the item is in the array or not
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return found (true) or not (false)
     */
    private boolean search(String[] arr, String item) {
        //traverse through 
        //using loop
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i].equals(item)) {
                
                // Found it, stop the loop by returning from the method!
                return true;
            }
        }
        
        // Go through the entire array, never found it
        return false;
    }

    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurrence of an item in the array and return
     * the index where it found it, or a -1 if not found 
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found
     */
    private int linearSearch(String[] arr, String item) {
        
        // Travel the array (traverse, means to "visit" every spot) using a loop
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i].equals(item)) {
                
                // Found it, now return the index of the first occurance (i)
                return i;
            }
        }
        
        // Go through the entire array, never found it
        // its -1 to account for array size
        return -1;
        
        // An alternative loop structure
        // int i = 0;
        // while (i < array.length) {
        //     if (array[i].equals(item)) {
        //         return i;
        //     }
        //     i++;
        // }
        // return -1; 
    }
}
