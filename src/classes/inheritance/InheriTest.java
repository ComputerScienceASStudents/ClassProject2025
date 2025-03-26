/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes.inheritance;

/**
 *
 * @author franz
 */
public class InheriTest extends InheritanceExample { //this is inheritance

    /**
     * The
        properties
        (encapsulated)
        and method
        stubs are
        coded in (not showed in here)
     */
    public InheriTest() {
        super(); //calls constructor
        
        AssociationEx associationEx = new AssociationEx(); //association this is
        
        slackOff();
    }
    
    /**
     * This is when you write a method with the same name as the
    classes parent (super) class, which causes this method to “over-
    ride” the parent (super) method and call the method of the child

    (sub) class
     */
    @Override
    public void cram() {
        super.cram();
        System.out.println("cram 2");
        
        //knowing we can use overloading 
        //we can use the concept of polymorphism which overrides methods for 
        //each class based on their data type
        //an example of this is utilizing object class methods
    }
    
    
    @Override
    public void slackOff() {
        System.out.println("eysyeyseyseyyesyeysyesyeys");
    }
    
}
