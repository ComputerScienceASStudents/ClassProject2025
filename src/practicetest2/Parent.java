package practicetest2;
 
/**
 * Parent.java - description
 *
 * @author Thomas.P
 * @since Feb 26, 2025, 10:10:27 a.m.
 */
public class Parent 
{

    public void m1(){
        System.out.println("pm1");
        m2();
        System.out.println("after call");
    }
    
    public void m2(){
        System.out.println("pm2");
    }
    
}