/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing.units;

/**
 *
 * @author franz
 */
public class Recursion {

    public Recursion() {
        int[] ar = {1, 3, 5, 8, 9, 12, 20, 34, 35, 68, 90};
        
        
        recTest();
        
        int yes = recursiveSearchingAndSort(ar, 3);
        System.out.println(yes);
    }

    /**
     * Creating a recursive method is to define one or a few base
    case(s), and then define rules to break down other cases
    into the base case
    * 
    * usually the recursion method requires a signature becuase you're returning
    * a value
     */
    private void recTest() {
        //These are called the recursive case(s)
//        if () { check if method reaches a limit
//            call method
//        }
//        else { returns a response if didnt meet requirements above
//            return
//        }
        /*
        Both the recursive and the iterative methods produce
        the same results, and are equally useful

        The positives of recursion is that it is often an easier
        solution with shorter code (and easier to read code)
        than the iterative solution

        The negatives of recursion is that the recursive
        solution is not always seen right away, and often using
        recursion might consume more memory than the
        iterative one
        */
    }

    
    /**
     * We often sort lists to implement a more
     * efficient search known as the binary
     * search
     * 
     * The binary search only works on a
     * sorted list
     */
    private static int recursiveSearchingAndSort(int[] ar, int par) {
        /*
        This search works by examining the
        middle item in a list, if it is the item
        sought you’re done
        
        Otherwise, if the number is lower (or
        higher) the binary search through the
        lower (or higher) half of the list
        */
        
        
        //The binary search is very efficient
        int high = ar.length - 1; //array length doesnt account for indexing so
                                  //you put - 1
        int low = 0;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            System.out.println("low is " + ar[low]);
            System.out.println("mid is " + ar[mid]); //remember arrays indexing at 0
            System.out.println("high is " + ar[high]);
            
            //taking priority
            if (ar[mid] == par) { //if mid equals the number found
                System.out.println("index found at " + mid + " and ar is " + ar[mid]);
                return mid;
            }
            //if mid is greater than (assuming order is least to greatest
            else if (ar[mid] > par) {
                
                high = mid - 1; // to compensate high
                
            }
            //iff less than mid
            else if (ar[mid] < par) {
                low = mid + 1; //to compensate arrays
                
            }
            
        }
        return -1; //returns index found at
    }
}
