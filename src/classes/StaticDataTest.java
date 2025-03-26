/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

/**
 *
 * @author franz
 */
public class StaticDataTest {

    /**
     * The static keyword means the “thing” the static modifier is being
     * applied to (e.g. data structure or method) “belongs” to the class
     * rather than the object(s) of that class
     * 
       only one copy of this variable only exists across all instances in the\
       class
     * they all share this data/variable
     * 
       
     */
    public static int veryStat = 1;
    
    public StaticDataTest() {
        
        /*
        If you declare any data structure as static, it is known
        static data structure, and if used with methods, they
        are called static methods
        */
        
        
    }
    
    /**
     * Methods within a class that can be called without creating an object of
     * the class
     * 
     * a method that is part of a class rather than an instance of that class
     * 
     * mostly used to access static fields
     * 
     * "Does it make sense to call this method, even if no object has been
     * constructed yet?"
     */
    public static void compareStats() {
        
    }
    
}
