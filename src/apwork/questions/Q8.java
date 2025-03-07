package apwork.questions;
 
/**
 * Q8.java - description
 *
 * @author Thomas.P
 * @since Feb 13, 2025, 9:49:59 a.m.
 */
public class Q8 
{

    /**
     * Default constructor, set class properties
     */
    public Q8() {
        
        String str = "o";
        
        String[] animals = {"horse", "cow", "goat", "dog", "cat", "mouse"};
        
        ////////////////////////////////////////////////////////////////////////
        //Example
        ////////////////////////////////////////////////////////////////////////
        int count0 = 0;
        for (int i = 0; i <= animals.length; i++) {
            if(animals[i].indexOf(str) >= 0){
                count0++;
            }
        }
        System.out.println(count0);
        ////////////////////////////////////////////////////////////////////////
        //proper
        ////////////////////////////////////////////////////////////////////////
        int count1 = 0;
        for (int i = 0; i </*=*/ animals.length; i++) {
            if(animals[i].indexOf(str) >= 0){
                count1++;
            }
        }
        System.out.println(count1);
        /**
         * 
         * the reason the first one doesn't work properly is because of the >= operator.
         * this is because animals.length is == to 6 because there are six objects
         * however from an index prospective there is only 5 because index always
         * starts at zero
         * 
         */
        
    }
    
}