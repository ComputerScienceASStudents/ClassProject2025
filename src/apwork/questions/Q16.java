package apwork.questions;
 
import javax.swing.JOptionPane;

/**
 * Q16.java - description
 *
 * @author Thomas.P
 * @since Feb 21, 2025, 10:32:14 a.m.
 */
public class Q16 {

    boolean con = false;
    
    public Q16(){
        int num = 0;
        
        while(!con){
            String x = JOptionPane.showInputDialog(null, "input a number", "Q16",
                JOptionPane.PLAIN_MESSAGE);
        
            try{
                con = true;
                num = Integer.parseInt(x);
            } catch(Exception e){
                con = false;
                JOptionPane.showMessageDialog(null, "I SAID A PROPER NUMBER... DOES |"
                    + x + "| LOOK LIKE A PROPER NUMBER TO YOU HUH?\nFIX IT!! >:(",
                    "Q16", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
        System.out.println("||"+getCheck(num)+"||");
    }
    
    /**
     * Returns the check digit for num, as described in part (a). Precondition:
     * The number of digits in num is between one and six, inclusive. num >= 0
     */
    public static int getCheck(int num) {
        /* to be implemented in part (a) */
        ////////////////////////////////////////////////////////////////////////MY CODE
        int digits = getNumberOfDigits(num);
        
        int x = 0;
        
        for (int i = 0; i <= digits; i++) {
            x += getDigit(num, 1) * (digits + 1);
        }
        
        digits = getNumberOfDigits(x);
        
        return getDigit(x, digits);
        ////////////////////////////////////////////////////////////////////////
    }

    /**
     * Returns true if numWithCheckDigit is valid, or false otherwise, as
     * described in part (b). Precondition: The number of digits in
     * numWithCheckDigit is between two and seven, inclusive. numWithCheckDigit
     * >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        /* to be implemented in part (b) */
        ////////////////////////////////////////////////////////////////////////MY CODE
        if(numWithCheckDigit < 2) return false;
        if(numWithCheckDigit > 7) return false;
        return true;
        ////////////////////////////////////////////////////////////////////////
        
    }

    /**
     * Returns the number of digits in num.
     */
    public static int getNumberOfDigits(int num) {
        /* implementation not shown */
        
        ////////////////////////////////////////////////////////////////////////MY CODE
        Integer x = (Integer)num;
        
        String y = x.toString();
        
        return y.length();
        ////////////////////////////////////////////////////////////////////////
        
    }

    /**
     * Returns the nth digit of num. Precondition: n >= 1 and n <= the number of
     * digits in num
     */
    public static int getDigit(int num, int n) {
        /* implementation not shown */
        
        ////////////////////////////////////////////////////////////////////////MY CODE
        
        boolean z = true;
        int w = 0;
        
        do{
            Integer x = (Integer)num;
        
            String y = x.toString();
        
            try{
                w = Integer.parseInt(y);
                z = false;
            } catch(Exception e){
                System.out.println("GIVE ME A REAL NUMBER >:(");
            }
        }while(z);
        
        return w;
        
        ////////////////////////////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////////////////////////////////
        
    }

    /* There may be instance variables, 
      constructors, and methods not shown. */
    

}