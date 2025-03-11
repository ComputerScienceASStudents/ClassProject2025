package apwork.questions;
 
/**
 * APClassQuestionArathmaticExeption.java - description
 *
 * @author Thomas.P
 * @since Mar 11, 2025, 10:31:57 a.m.
 */
public class APClassQuestionArathmaticExeption 
{

    /**
     * Default constructor, set class properties
     */
    public APClassQuestionArathmaticExeption() {
        
        
        
        try{
            System.out.println(-10/10);
        }catch(Exception e){
            System.out.println("lets see if this is an exeption");
        }
        
        try{
            System.out.println(30/0);
        }catch(Exception e){
            System.out.println("this one i know is an exeption");
        }
        
    }
     
    
    
}