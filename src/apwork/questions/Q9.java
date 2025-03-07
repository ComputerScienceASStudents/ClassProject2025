package apwork.questions;
 
import javax.swing.JOptionPane;

/**
 * Q9.java - description
 *
 * @author Thomas.P
 * @since Feb 14, 2025, 9:50:57 a.m.
 */
public class Q9 
{
    
    int[] nums = new int[4];

    /**
     * Default constructor, set class properties
     */
    public Q9() {
        
        String[] options = {"Case 1", "Case 2", "Case 3"};
        
        System.out.println(options[0].length());
        
        int choice = JOptionPane.showOptionDialog(null, "Whice case do you think"
                + " works?", "Q9", 0, JOptionPane.PLAIN_MESSAGE, null, options, 0);
        
        switch(choice){
            case 0:
                
                /**
                 * 
                 * int k = 0;
                 * while(k < nums.length){
                 *      nums[k] = nums[k] * nums[k];
                 * }
                 * 
                 */
                
                JOptionPane.showMessageDialog(null, "Nope don't even try. var K "
                        + "is never updated and it will loop forever", "Q9", 
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                
                
                
                JOptionPane.showMessageDialog(null, "Horay you got it correct! The "
                        + "loop works properly and every var is updated and changed"
                        + " correctly.", "Q9", 
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "ooo soo close, but not quite. "
                        + "because of the way that enhanced for loops work you can't"
                        + " change the array var within the loop", "Q9", 
                        JOptionPane.PLAIN_MESSAGE);
                break;
        }
        
    }
    
}