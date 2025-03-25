package apwork;
 
import apwork.questions.APClassQuestionArathmaticExeption;
import apwork.questions.EQ1;
import apwork.questions.Q16;
import apwork.questions.Q2;
import apwork.questions.Q3;
import apwork.questions.Q4;
import apwork.questions.Q5;
import apwork.questions.Q6;
import apwork.questions.Q7;
import apwork.questions.Q8;
import apwork.questions.Q9;
import apwork.questions.Unit2Question;
import javax.swing.JOptionPane;

/**
 * ExampleQuestions.java - description
 *
 * @author Thomas.P
 * @since Feb 7, 2025, 10:05:15 a.m.
 */
public class ExampleQuestions 
{

    /**
     * Default constructor, set class properties
     */
    public ExampleQuestions() {
        
        String first = JOptionPane.showInputDialog(null, "Alright what question set"
                + " are you reviewing this time? \n\n enter 1, 2, or 3 for the set"
                + " you want to go to. or 4 for other.", "My Ap stuff",
                JOptionPane.PLAIN_MESSAGE);
        
        switch(first){
            case"1":
                set1();
                break;
            case"2":
                
                break;
            case"3":
                
                break;
            case"4":
                other();
                break;
            default:
                System.out.println("don't fool arownd nerd");
                break;
        }
        
    }
    
    private void set1(){
        
        String choice = JOptionPane.showInputDialog(null, "Alright what question are"
                + " you reviewing again? \n\n enter the number of the question "
                + "you want to run.", "My Ap stuff", JOptionPane.PLAIN_MESSAGE);
        
        switch(choice){
            case "0":
                System.exit(0);
                break;
            case "1":
                EQ1 q1 = new EQ1();
                break;
            case "2":
                Q2 q2 = new Q2();
                break;
            case "3":
                Q3 q3 = new Q3();
                break;
            case "4":
                Q4 q4 = new Q4();
                break;
            case "5":
                Q5 q5 = new Q5();
                break;
            case "6":
                Q6 q6 = new Q6();
                break;
            case "7":
                Q7 q7 = new Q7();
                break;
            case "8":
                Q8 q8 = new Q8();
                break;
            case "9":
                Q9 q9 = new Q9();
                break; 
            case "16":
                Q16 q16 = new Q16();
                break;
            default:
                System.out.println("how did you type " + choice + "? how do you "
                        + "manage that?" );
        }
    }
    
    private void set2(){
        
    }
    
    private void set3(){
        
    }
    
    private void other(){
        
        APClassQuestionArathmaticExeption ap = new APClassQuestionArathmaticExeption();
        
        Unit2Question u2q = new Unit2Question();
        
    }
     
    
    
}