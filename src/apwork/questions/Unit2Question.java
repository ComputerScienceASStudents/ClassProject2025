package apwork.questions;
 
/**
 * Unit2Question.java - description
 *
 * @author Thomas.P
 * @since Mar 18, 2025, 10:36:16 a.m.
 */
public class Unit2Question 
{

    /**
     * Default constructor, set class properties
     */
    public Unit2Question() {
        String word = "September";

        String str1 = word.substring(0, 3);

        String str2 = word.substring(word.length() - 3);

        System.out.println("word.length() - 3 = " + (word.length() - 3));
        
        System.out.println("word.substring(6) = " + word.substring(6));
        
        System.out.println(str1 + " " + str2);
        
        
        
    }
     
    
}