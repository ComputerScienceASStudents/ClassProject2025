/** Required package class namespace */
package Tools;
 
/**
 * UsefulMethods.java - description
 *
 * @author Thomas Paterson
 * @since Dec 20, 2024, 11:56:41 a.m.
 */
public class UsefulMethods 
{

    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    public static int random(int low, int high) {
        double seed   = Math.random();              // Create random seed value
        double L      = (double)low;                // Cast low boundry
        double H      = (double)high;               // Cast high boundry
        double value  = (H - L + 1) * seed + L;     // Apply formula
        int    answer = (int)value;                 // Cast back to integer
        return answer;                              // return final value     
    }
    
}