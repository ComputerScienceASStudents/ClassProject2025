/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing.units;

/**
 *
 * @author franz
 */
public class PrimitiveTypes {
    
    
    //constructor... remind me what this is?
    public PrimitiveTypes() {
        
        ////////////////////////////////////////////////////////////////////////
        //VARIABLES - primitive, or built-in data types - primitive types
        ////////////////////////////////////////////////////////////////////////
        
        //variables are used to store basic info yada yada idc
        
        //8 types of data types and limits 
        boolean condition = true; // true / false
        
        byte bits = 127; // -128 to 127
        
        short jorts = 32767; // -32,768 to 32,767
        
        int interge = 2147483647; // -2147483648 to 2147483647
        
        long longerInt = Long.MAX_VALUE;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        float smallerDouble = Float.MAX_VALUE; //1.40239846e-45f to 3.40282347e+38f
        
        double thisDouble = Double.MAX_VALUE; //4.9e-324 to 1.7e+308
        
        //then theres void which is used when u dont specify a return in a class
        
        //NAMING RULES
        
        /*
            You can use letters (A-z, a-z), numbers (0-9),
            dollar signs ($), and Underscore ( _ )
            You cannot begin a variable name with a number
            Case matters (e.g. MYNAME is different from myName)
            Dollar signs and underscore are not recommended to
            begin variable names
            Remember that in good style you should use meaningful
            but reasonable variable names, start in lower case and
            capitalize only the first letter of each new word
        
        
            For example: dogAge, fileName, aVeryLongName, etc.
        
            DO NOT USE JAVA KEYWORDS
        */
        
        ////////////////////////////////////////////////////////////////////////
        //expressions and assignment statements
        ////////////////////////////////////////////////////////////////////////
        //basically assigning variables or resolving it into a value
        //An expression is any valid unit of code that resolves to a value. 
        
        //use = 
        
        //operators - THEY FOLLOW PEMDAS
        // * - multipl
        // / - division
        // + - addition or concatenate (linking things together)
        // - - subtracting
        
        //LIKE MATH BRACKETS USED TO OVERRIDE OPERATOR PRECEDENCE (priority)
        
        double sample = 4^2 - (4*2*28);
        System.out.println("\n" + sample); 
        
        //Integer division automatically truncates the DECIMAL POINT so
        //if result of 5/2 is 2.5 its read as 2
        ////////////////////////////////////////////////////////////////////////
        
        
        //operators - a sign or symbol that specifies the type of calculation
        //to perform within an expression
        
        //constants - variables that can be used, but not changed
        //naming rules - USE CAPS AND _ FOR TO SEPARATE WORDS
        
        ////////////////////////////////////////////////////////////////////////
        //compund assignment operators
        ////////////////////////////////////////////////////////////////////////
        
        //two special types increment and decrement
        // ++ and --
        //using this either adds subtract the number by 1
        
        /*
        As well, the basic math operations can use another short-hand
        notation to assign values to variables in a quicker (less-typing)
        way, for example...
        */
        
        int x = 0;
        x += 7; //basically x = x + 7
        
        
        ////////////////////////////////////////////////////////////////////////
        //casting ranges and variables
        ////////////////////////////////////////////////////////////////////////
        
        /*
        Evaluate arithmetic
        expressions that use casting
        */
        
        /*
            In Java arithmetic operation should always be done on
            variables of the same type
        */
        
        int b = 6;
        int c = 1;
        
        int d = b + c; //if double then error
        
        /*
        Data types can be converted in two ways, which is known a type casting (or
        just casting)
        */
        
        //method 1 - only works with numerical data
        int j;
        double p = 1.9;
        
        j = (int)p; //the one in brackets is how you want it to be converted to
        System.out.println(j); //only 1 is read
        
        
        
    }
    
    
}
