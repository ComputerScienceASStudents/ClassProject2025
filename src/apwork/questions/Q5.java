package apwork.questions;
 
/**
 * Q5.java - description
 *
 * @author Thomas.P
 * @since Feb 11, 2025, 10:11:04 a.m.
 */
public class Q5 
{

    /**
     * Default constructor, set class properties
     */
    public Q5() {
        
        boolean a = true;
        boolean b = false;
        
        if( a && !(b||a) ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        /**
         * 
         * it is always false because the line follows a form of algabra/ order of
         * operations. if "a" is true and "b" is false it will start with the brackets,
         * finding the true value then checking if that value is true with the '!'
         * in which it is not because it looked for the true value.
         * 
         * t      f  t      t      t        
         * a && !(b||a) --> a && !(a) --> true && false --> false
         * 
         */
        
    }
     
    
    
}