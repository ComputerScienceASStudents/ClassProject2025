package apwork.questions;
 
/**
 * Q4.java - description
 *
 * @author Thomas.P
 * @since Feb 10, 2025, 10:38:12 a.m.
 */
public class Q4 
{

    /**
     * Default constructor, set class properties
     */
    public Q4() {
        
        /**
         * 
         * the answer to the question is E because 115 is lower then 120 so it is
         * classed as mid-sized which is correct where as the other answers that
         * would fit into other catagories also go into mid size because they are
         * all less then 120 and that is what is checked first
         * 
         */
        
    }
    
    public static String classify(int volume){
        String carClass = "";
        if(volume >= 120){
            carClass = "Large";
        }else if (volume < 120){
            carClass = "Mid-Size";
        }else if (volume < 110){
            carClass = "compact";
        }else if (volume < 100){
            carClass = "subcompact";
        }else{
            carClass = "minicompact";
        }
        return carClass;
    }
    
}