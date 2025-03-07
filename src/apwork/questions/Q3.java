package apwork.questions;
 
/**
 * Q3.java - description
 *
 * @author Thomas.P
 * @since Feb 10, 2025, 10:21:36 a.m.
 */
public class Q3 
{

    /**
     * Default constructor, set class properties
     */
    public Q3() {
        
        /**
         * 
         * The answer to this question is D because it is the method that gets the
         * minimum of 25 and the max of 60 because math.random does NOT get to one
         * but can only go 0.999999 because it only returns a double between 0-1.
         * 
         */
        
        System.out.println("RANDOM");
        double x = Math.random();
        System.out.println(x);
        double y = x*36;
        System.out.println(y);
        int z = (int) (y + 25);
        System.out.println(z);
        
        System.out.println("MAX");
        double a = 0.9999999999999;
        System.out.println(a);
        double b = a*36;
        System.out.println(b);
        int c = (int) (b + 25);
        System.out.println(c);
        
        System.out.println("MIN");
        double d = 0.00000000001;
        System.out.println(d);
        double e = d*36;
        System.out.println(e);
        int f = (int) (e + 25);
        System.out.println(f);
        
    }
    
}