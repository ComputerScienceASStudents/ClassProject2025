/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package array2d;

import java.util.Arrays;

/**
 *
 * This unit focuses on multidimensional data structures, which builds on
the concept of a one-dimensional array learned in unit 6
* 
A 2D array is most suitable to represent a table, and each table element is
accessed using the variable name and row and column indices
* 
 * @author franz
 */
public class Array2dTest {

    public Array2dTest() {
        /*
        Unlike 1D arrays, 2D arrays require nested iterative statements to traverse
        and access all elements
        */
        
        
        
        /*
        A two-dimensional array is essentially
        an "array of arrays"
        A multidimensional array can be seen
        as a table of rows and columns
        */
        
        //type name [][] = new type[][] <-- must explicitly state the dimensions
        int marteix[][] = new int[5][10];
        
        //System.out.println(marteix[0].length);
        
        /*
        You can also create an initialized
        matrix by using nested sets of the {}
        braces and commas
        */
        char tick[][] = {
            {'t', 'i', 'c', 'k'},
            new char[4]
        };
        
        /*
        [t][i][c][k]
        [][][][]
        [][][][]
        [][][][]
        [][][][]
        
        
        
        
        You can create 3 dimensional arrays (an
        array of arrays of arrays), 4 dimensional
        arrays (an array of arrays of arrays, of
        arrays), 5 dimensional arrays (an array of
        arrays of arrays...), etc.
        Although some of these arrays cannot be
        visualized in our geometry system (which
        only has 3 dimensions)
        */
        
        
        
        ////////////////////////////////////////////////////////////////////////
        //traversing 2d arrays
        
        
        /*
        Nested For loops are used to traverse across matrices
        and access the elements in the rows and columns,
        */
        int array[][] = createArray(7, 10);
        //display(array);
        
        
        /*
        array outputs this
        row counts down
        columns count left to right
        
            c c c c c c c c c c c
        row 0 0 1 0 0 1 0 1 1 0 1
        row 1 0 0 1 1 1 0 1 0 1 0
        row 2 1 0 1 1 1 0 1 0 1 0
        row 3 1 1 1 1 1 0 1 1 1 0
        row 4 1 1 1 1 1 1 1 0 0 1
        row 5 0 1 0 1 0 1 1 0 1 0
        row 6 0 0 1 0 1 1 0 0 0 0
        */
        
//        int[][] points = {
//            {11, 12, 13, 14, 15},
//            {21, 22, 23, 24, 25},
//            {31, 32, 33, 34, 35},
//            {41, 42, 43, 44, 45},
//            {51, 52, 53, 54, 55}
//        };
//        
//        //System.out.println(points.length);
//        //System.out.println(points[0].length);
//        
//        //for every row...
//        for (int row = 0; row < points.length; row++) {
//            
//            //for every column doing down
//            for (int col = points[0].length - 1; col >= row; col--) {
//                //System.out.print(points[row][col] + " ");
//            }
//            //System.out.println("");
//            
//            //System.out.println("row: " + row);
//        }




        int[][] ar = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(ar[0] + "");
        
        int sum = 0;
        //System.out.println(ar[2][0]);
        
        //rows go left to right
        //cols go to top to bottom
        
        //for (variable : collection)
        for (int[] x : ar) {
            
            //x accounts for the number of rows there are (l to r)
            /*
            First, x will be {1, 2, 3, 4}
            Second, x will be {5, 6, 7, 8}
            Third, x will be {9, 10, 11, 12}
            */
            
            //y accounts for columns number of columns there are (t to b)
            //iterates except last index
            for (int y = 0; y < x.length - 1; y++) {
                //1, 2, 3 (exclude 4)
                //5, 6, 7 (exclude 8)
                //so on...
                sum += x[y];
            }
            
            
        }
        //System.out.println(sum);
        
    }

    /**
     * creates a random integer from zero to 1 and put its in array index
     * 
     * @param rows
     * @param columns
     * @return 
     */
    private int[][] createArray(int rows, int columns) {
        
        int matrix[][] = new int[rows][columns];
        
        //for loop that covers each row
        //remember code executes at index zero once code meets conditions to
        //account for array indexing
        for (int row = 0; row < rows; row++) {
            
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = randomInteger(0,1); //low and high
            }
        }
        
        return matrix;
    }

    private void display(int[][] array) {
        String output = "";
        
        //accounts for rows
        //row 0 0 0 1 0 0 1 1 0 1 1
        for (int row = 0; row < array.length; row++) {
            output += "row " + row;
            //array[0] is there to access the length of the first element
            for (int column = 0; column < array[0].length; column++) {
                output += " " + array[row][column];
            }
            output += "\n";
        }
        
        System.out.println(output);
    }

    /**
     * outputs random between 0 and 1
     * 
     * 
     * @param low
     * @param high
     * @return 
     */
    private int randomInteger(int low, int high) {
        //remember the formula (high - low + 1) * random + low
        return (int)((high - low + 1) * Math.random()+ low);
    }

}
