/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing.units;

/**
 * The AP Computer Science curriculum describes this topic 6.1 as
 * managing large amounts of data or complex relationships in data,
 * programmers write code that groups the data together into a single
 * data structure without creating individual variables for each value.
 * 
 * In Computer Science, an array is
 * defined as a group of memory
 * locations (variables) stored
 * continuously in memory
 * 
 * They MUST have the save name and type
 * each variable in an array is called a member or an
 * element is identified by a number called the index
 * 
 * @author franz
 */
public class Arrays {

    
    
    public Arrays() {
//        In Java (and most programming
//        languages), indexing begins with 0

//        The numbers inside the parenthesis
//        after the array name indicate which
//        element you are referring to

//        The number inside parenthesis is called
//        the arrays subscript
        //example array[8];
        
        
        /*
        When we declare the array, we specify the
        array type, array name, and array size
        (which is optional at the time of
        declaration)
        */
        int array[] = new int[5];
        double arrayEx[] = {
            0.5,
            1.0,
            9.1
        }; //index is 2 because counting starts at 0
        
        //the number inside the parenth is the subscript
        array[2] = 5; //Notice that we use squared brackets [] in Java
//                    NOT round brackets () as these are used for
                    //methods
                    
        /*
        All arrays in Java begin their indexing at 0
        Array subscripts are of an unknown value when
        initialized
        */
        
        /*
        In addition to creating multiple arrays in
        one declaration statement, you can also
        create and initialize multiple arrays in one
        declaration statement, as seen here...
        */
        int[] a = new int[10], b = new int [20];
        //not recommended
        
        
        
        
        /*
        You can use the individual
        elements of an array, by
        accessing them using the arrays
        subscript value in your code
        
        However, to access the entire
        array, or to make assignments to
        the entire array, most often in
        Computer Science, a loop is used
        
        Specifically a for loop
        */
        
        //example. initializing the array a
        /*
        A ‘built-in method’ available for all arrays,
        the .length feature returns the size
        (number of elements) of an array
        */
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
            System.out.println("\narray at " + i +" has "+ a[i]);
        }
        
        //Keep in mind that the size of an array
//        (number of elements) is not the same as
//        the subscript of the last element
//        (because arrays start counting at 0)
        //
        
        
        
        traversingArrays();
        
        enhancedForLoops();
        
        algorithmsArrays();
    }

    
    private void traversingArrays() {
        /*
        Methods
        can also
        return an
        entire
        array of
        values
        and
        populate
        another
        array
        */
        
        //for example
        int[] arrayEx = {
            1,
            2,
            3
        };
        
        showArray(arrayEx);
        
        
        /*
        ^^^^^^^^^^^^
        |
        |
        Arrays are treated as objects by
        Java, therefore are always passed
        by reference (thus any changes
        inside the method are reflected)
        */
        
        //A single element of an array can also be
        //passed as an argument
        getElement(arrayEx[1]);
        
        System.out.println("" + arrayEx[1]);
    }

    private void showArray(int[] arrayEx) {
        String y = "";
        for (int i = 0; i < arrayEx.length; i++) {
            y += arrayEx[i] + ", ";
            
        }
        System.out.println(y);
    }

    private void getElement(int i) {
        i = 12; 
        /*
        However, array elements are always sent
        by value (a copy) to a method
        
        just use array[1] = 123123123; instead of using a method
        */
    }

    /*
    not necessary but prob in test
    this loop is an option for looping through arrays or collections
    */
    private void enhancedForLoops() {
        
        //enhanced for loops allow you to write a loop without a counter
        //ex.
        int[] arrayEx = {
            1,
            2,
            3
        };
        
        for (int value : arrayEx) {
            System.out.println("number is " + value);
        }
    }

    private void algorithmsArrays() {
        
    }
}
