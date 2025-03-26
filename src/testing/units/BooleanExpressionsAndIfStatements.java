/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing.units;

/**
 * A Boolean expression is a statement that evaluates to a Boolean value, which
 * is either true or false
 * 
 * 
 * @author franz
 */
public class BooleanExpressionsAndIfStatements {

    public BooleanExpressionsAndIfStatements() {
        
        //conditional statements are used to control the
//        flow of a program
        //Unless these statements are used, the program always executes
        //sequentially (top to bottom)
        
        
        //A Boolean expression always evaluates to either True or False
        //rational operators
//        <
//        >
//
//        <=
//
//        >=
//
//        ==
//        !=
//
//        Less than
//        Greater than
//        Less than or equal to
//
//        Greater than or equal to
//        Equal to
//        Not equal to
        //
        
        
        testing();
    }

    private void testing() {
        ifStatementsAndMore();
        equivalentBoolExp();
        comparingObjects();
    }

    private void ifStatementsAndMore() {
        //decisions are made through if statements (if variables meet specifics)
        boolean y = true;
        
        //ex
        if (y == false) {
            System.out.println(""); //this doesnt execute the sout
        }
        
        ////////////////////////////////////////////////////////////////////////
        //if else
        
        //The code following else only
//        executes if the first if statement is
//
//        false
        //If the first if statement is true,
        //then the code after the if executes,
        //and the code after else does not
        //
        
        
        if (y == false) {
            System.out.println("what");
        }
        else {
            System.out.println("y");
        }
        
        /*
        Notice that if you use only one statement after a
        if or else statement, you do not need the
        { } (but I recommend you use them anyways!)
        */
        
        ///////////////////////////////////////////////////////////////////////
        //else if statements
        
        /*
        The computer moves
        through the if and
        each else if
        
        You can also include an
        optional else statement
        (if all other cases fail)
        */
        
        /*
        The “switch” statement can also be used to control
        flow amongst various options, for example:
        */
        
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            default:
                System.out.println("Other"); break;

        } // end switch
        
        /*
        The curly braces { and } define the block of
        code and where it begins and ends
        */
        
//        “Nesting an If Statement”
//
//        Means you place another
//
//        if statement
//        inside the block
//
//        of another if or else statement
        //
        //example
        
//        if (false) {
//            
//            
//            if () {
//                
//                
//               if () {
//                   
//               } 
//               else {
//                   
//               }
//               
//            }
//            else {
//                
//            }
//        }
//        else {
//            
//        }
        //The curly braces { and } define the block after condition of
        //code and where it begins and ends
        
        
    }

    /**
     * A Boolean expression can be formed using
    Visual C# logical operators
    Logical operators allow you to join together
    two expressions to create an expression which
    evaluates to either true or false
     * 
     */
    private void equivalentBoolExp() {
        /**
         * The three logical operators are:

           And ←→ Or ←→ Not
           && ←→ || ←→ !
         */
        
        /*
        When the logical expression And is
        used the overall expression evaluates
        to true when both the first AND the
        second expression are both true
        When the logical expression Or is used
        the overall expression evaluates to true
        when either the first OR the second
        expression are true
        */
        
        //REMEMBER IF THIS IS WRITTEN IN ALGEBRA FORM THEN_ITALWAYS PUT BRACKETS
        //FIRST
        
        /*
        The Not ! operator will
        reverse a expression
        */
        //example !var is now false assuming var = true;
        
        
        
    }

    /**
     * Compare object
        references using
        Boolean expressions
        in program code
        * 
     */
    private void comparingObjects() {
        //So from now on, I recommend we get in the habit of always overriding
        //the equals, toString, and clone methods every time you write a class
        
        
    }
    
    
}
