package apwork.questions;
 
/**
 * Q2.java - description
 *
 * @author Thomas.P
 * @since Feb 10, 2025, 9:56:17 a.m.
 */
public class Q2 
{

    /**
     * Default constructor, set class properties
     */
    public Q2() {
        
        String word1 = "hello";
        String word2 = "world";
        
        processWords(word1, word2);
        
    }
    
    /**
     * 
     * this answer to this question is answer A because the output is always.
     * this is due to the way that index of works returning the index of the start
     * of the string witch in this case starts at index 0 of the result String
     * 
     */
    
    private void processWords(String word1, String word2){
        
        String str1 = word1.substring(0, 2);
        String str2 = word2.substring(word2.length() -1);
        String result = str2 + str1;
        System.out.println(result.indexOf(str2));

    }
    
}