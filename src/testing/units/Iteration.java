/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing.units;

/**
 * This unit of the AP curriculum focuses on iteration, which is
 * represented in a program by using loops
 * 
 * 
 * Iteration uses while and for loops, with Boolean expressions
    being one of the main components in iteration, and several
    standard algorithms that use iteration
 * 
 * 
 * In addition, iteration is used when traversing data
    structures such as arrays, ArrayLists, and 2D arrays –
    along with it being a necessary component of several
    standard algorithms, including searching and
    sorting, which will be covered in later units
    * 
    * 
    * 
 * 
 * @author franz
 */
public class Iteration {

    public Iteration() {
        
        
        loopsTest();
    }

    /**
     * Loops allow you to repeat one or more
       instructions over and over
       * 
       Each repetition of the loop is usually controlled
       by the outcome of a conditional statement
       which will evaluate to true or false
     */
    private void loopsTest() {
        
        /**
         * Each repetition of the loop is usually controlled
           by the outcome of a conditional statement
           which will evaluate to true or false
           * 
           * 
           Then inside the body of the loop, something will
           occur that may (or may not) cause the testing
           condition to evaluate differently the next time
           through the loop
         */
        
        
        /*
        Loops can occur in two ways:
        
        Event controlled loops are used when
        you don’t know when to stop a loop (an
        event – e.g. the end of a file) will trigger the
        end of the loop
        ex. --> while loops 
        
        Event controlled loops come in two forms:
        1. When you want a test first at the top of the loop (while loop)
        2. When you want the code body executed at least once (do while loop)
        and then tested at the bottom of the loop
        
        loops are tested with a boolean expression with combinations of logical
        expression
        
        Count controlled loops are used when
        you need to execute the loop a specific
        number of times (e.g. X times)
        ex. --> for loops
        
        */
        whileLoopsTest();
        forLoopTest();
        
        stringTest();
        
        nestedInteration();
        
        
        iterationTest();
    }

    private void whileLoopsTest() {
        
        //how to make while loop
//        while (true) {
//            return; //block of code
//        }
        //A variation of the while loop adds the do
        //keyword and a different structure
        
        //This loop is the second form of the while
//        loop, when you want the code body
//        executed at least once and then tested at
//        the bottom of the loop instead of the top
        //
        
        /*
        It has a stricter syntax and strangely adds a
        semicolon ; to the end of the loop
        */
//        int number = 0;
//        do 
//        {
//            //code here
//        }while(number != 5);
        //
        
        /*
        ///////////////////////////////////////////////
        Use the loop that is appropriate for the
        circumstance that you need in your
        code
        ///////////////////////////////////////////////
        
        Sometimes the logic dictates that a
        do...while loop is more
        appropriate that a while... Loop,
        and visa versa
        */
        
        
        
    }

    private void forLoopTest() {
        //for loops - The for loop repeats a set of code instructions a specific
        //number of times
        //REMEMBER THAT THE INDEX CHANGES AFTER THE BLOCK OF CODE IS DONE
        
//        for (variable startingValue; variable endingValue; variable change)
//        {
//        // loop code block body
//        }

        //It will continue executing until a counter variable reaches the
        //end value specified
        
        
        ///With for loops, you
//        create the variable
//        used to count the loop
//        right inside the loop
        //The variable name i is commonly used (standing for iteration – another
        //name for loop) but any name (e.g. counter) can be used
        
        
        //usually i++ means i = i + 1;
        
        
    }

    /**
     * developing algorithms using strings
     * 
     * refer to strings in objects unit for review
     */
    private void stringTest() {
        
        String name = "Lawrence Wachs";
        char firstLetter;
        firstLetter = name.charAt(0);
        /*This takes the string as an array of chars and returns the char at
        position 0 (the first position)*/
        int stringLength = name.length();
        /*This returns the number of characters in the string*/
        
        char lastLetter = name.charAt(stringLength - 1);
        boolean isSame;
        String newName = "Lawrence Wachs";
        isSame = name.equals(newName);
        /*This compares them to see if they are equal*/
        System.out.println(name + "," + firstLetter + "," + lastLetter +

        "," + isSame);
        
    }

    /**
     * Loops can be nested to
        create complex compound
        statements
        * 
        * Be familiar with tracing
        these types of loops (for 2d arrays)
     */
    private void nestedInteration() {
        //row
        for (int i = 0; i < 10; i++) {
            //column
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }

    private void iterationTest() {
        int nums[] = new int[5];
        
        //skips "n < nums.max; n++
        for (int n: nums)
        {
            System.out.println(n);
        }
        
    }
}
