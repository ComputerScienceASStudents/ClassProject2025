package apwork.questions;
 
/**
 * Q6.java - description
 *
 * @author Thomas.P
 * @since Feb 11, 2025, 10:25:08 a.m.
 */
public class Q6 
{

    /**
     * Default constructor, set class properties
     */
    public Q6() {
        
        int val = 48;
        int div = 6;
        
        while((val % 2 == 0) && div > 0){
            
            if(val % div == 0){
                System.out.println(val + " ");
            }
            val /= 2;
            div--;
            
        }
        
        /**
         * 
         * it is (A) because when running 48 is divisible by 2 and div > 0 so it loops
         * then 48 is divisible by 6 so it will sout and it will loop to 24%5 which
         * != 0 so it skips to 12 and 4 and continues until it can't
         * 
         */
        
    }
    
}