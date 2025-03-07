package apwork.questions;
 
/**
 * Q7.java - description
 *
 * @author Thomas.P
 * @since Feb 13, 2025, 9:42:51 a.m.
 */
public class Q7 
{

    /**
     * 
     * this question is more about the theory of coding and proper formating of code.
     * this question is a matter of getting a var from a class and for that you
     * would use something called an accessor method. an accessor methods whole
     * job is to access a var in a class and return it to where it was called.
     * it is used to access private vars from outside of the class.
     * 
     */
    
    private int x;
     
    /**
     * 
     * accessor method
     * 
     * @return the int being accessed
     */
    public int getX(){
        return x;
    }
    
    /**
     * 
     * mutateor method for reference
     * 
     * public void setX(int x){
     *      this.x == x;
     * }
     */
    
    
}