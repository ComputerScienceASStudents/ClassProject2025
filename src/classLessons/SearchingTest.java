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
        
        ////////////////////////////////////////////////////////////////////////
        // To use a binary search, there is a pre-condition that has to be 
        // true before the search can take place...
        //   - The array/list has to be SORTED first!
        // We will manually sort the array and ArrayList in order...
        ////////////////////////////////////////////////////////////////////////
        
        String[] sortedArray = {
            "Alan",             // Index 0
            "Cam",              // Index 1            
            "Finlay",           // Index 2
            "Franz",            // Index 3            
            "Hunter",           // Index 4            
            "Izen",             // Index 5            
            "Jonah",            // Index 6            
            "Kaleb",            // Index 7
            "Kurt",             // Index 8
            "Nathaniel",        // Index 9
            "Neal",             // Index 10
            "Orion",            // Index 11
            "Teddy",            // Index 12
            "Thomas",           // Index 13
            "Tristan",          // Index 14
            "Wachs",            // Index 15
            "William",          // Index 16
            "Yevheniia",        // Index 17
        };
        ArrayList<String> sortedList = new ArrayList<>();
        
        for (String string : sortedArray) {
            sortedList.add(string);
        }
        ////////////////////////////////////////////////////////////////////////
        
        index = binarySearch(sortedArray,item);
        System.out.println("Binary search array: " + item + " at index " + index);
        index = binarySearch(sortedList,item);
        System.out.println("Binary search list: " + item + " at index " + index);
                
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
        return -1; //flag value
        
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
    
    /**
     * An implementation of a binary search algorithm. It will find the first 
     * occurrence of an item in the array and return the index where it 
     * found it, or a -1 if not found
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private static int binarySearch(String[] array, String item) {
        int low  = 0;                   // Marker for the low end
        int high = array.length - 1;    // Marker for the high end
        while(low <= high) {            // Continue while markers not collapsed
            int mid = (high + low) / 2; // Calculate middle between markers
            if      (array[mid].equals(item))        return mid; // Found it
            else if (array[mid].compareTo(item) > 0) high = mid - 1; // Too high 
            else if (array[mid].compareTo(item) < 0) low  = mid + 1; // Too low
        }
        return -1;  // Not found
    }
    
      //HERE IS AN EXAMPLE OF THE SAME ALGORITHM USING INTEGERS.....
//    private int binarySearch(int[] array, int item) {
//        int low  = 0;                   
//        int high = array.length - 1;    
//        while(low <= high) {          
//            int middle = (high + low) / 2;  
//            if (array[middle] == item){
//                return middle;
//            } 
//            else if (array[middle] > item) {
//                high = middle - 1;
//            }
//            else if (array[middle] < item) {
//                low  = middle + 1;
//            }
//        }
//        return -1;  
//    }
    
    /**
     * Another implementation of a binary search algorithm. This implementation
     * uses a wrapper method around a private utility recursive method. It will
     * find the first occurrence of an item in the ArrayList and return the 
     * index where it found it, or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private static int binarySearch(ArrayList<String> list, String item) {
        return binaryRecursive(list,item,0,list.size());
    }
    
    /**
     * Recursive method used to find the item in the list and return the index 
     * of it's location or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @param low the lowest index to start from
     * @param high the highest index to go to
     * @return the first index found at, or a -1 if not found 
     */
    private static int binaryRecursive(ArrayList<String> list, String item, 
                                      int low, int high) {
        if (low <= high) {                      // While markers not collapsed
            int mid = low + (high - low) / 2;   // Calculate middle point 
            if (list.get(mid) == null)
                return -1;
            else if (list.get(mid).compareTo(item) > 0) 
                return binaryRecursive(list,item,low,mid-1);
            else if (list.get(mid).compareTo(item) < 0) 
                return binaryRecursive(list,item,mid+1,high);
            else                                        
                return mid;
        }
        return -1;                              // Not found
    }
}
