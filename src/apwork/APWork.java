package apwork;

import testRandomThings.TestThings;
import javax.swing.JOptionPane;
import Tools.LinkedList;
import practicetest2.Controler;

/**
 * APWork - this program is an amalgamation of things i am going to work on in the
 * duration of the course
 * 
 * @author Thomas.P
 * @since Feb 4, 2025
*/
public class APWork
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] options = new String[5];
        
        options[0] = "quit";
        options[1] = "test things";
        options[2] = "EQs";
        options[3] = "project for gits and shiggles";
        options[4] = "practice test";
        
        int choice = JOptionPane.showOptionDialog(null, "hey look at that you're"
                + " testing again! \n\n what are you going to test?", "My Ap stuff",
                0, JOptionPane.PLAIN_MESSAGE, null, options, 0);
        
        switch(choice){
            case 0:
                System.exit(0);
                break;
            case 1:
                TestThings game = new TestThings();
                break;
            case 2:
                ExampleQuestions eq = new ExampleQuestions();
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                Controler c = new Controler();
                break;
        }
                
        
    }

}