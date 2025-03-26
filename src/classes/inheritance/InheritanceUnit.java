/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes.inheritance;

/**
 *
 * This unit will go over how one of the strongest advantages of
 * Java is the ability to categorize classes into hierarchies through
 * inheritance
 * It will also show how certain existing classes can be extended to
 * include new behaviors and attributes without altering existing
 * code
 * The unit will develop newly created classes are called
 * subclasses and how to recognize common attributes and
 * behaviors that can be used in a superclass and will then create a
 * hierarchy by writing subclasses to extend a superclass
 * Recognizing and utilizing existing hierarchies will help students
 * create more readable and maintainable programs
 * 
 * @author franz
 */
public class InheritanceUnit {

    
    /**
     * One of the more powerful features of Object Oriented
    Programming is the concept of inheritance
    This borrows a concept from biology where children
    inherit traits from the parents
     */
    public InheritanceUnit() {
        
        //important facts about inheritance
        /*
        class that inherits something is called a subclass
        
        a class that is inherited is called a superclass
        
        subclasses -> "is a" relationship
        
        a CLASS can have many SUBCLASSES
        but they can only inherit ONE superclass
        */
        
        //any use with private modifier will not be inherited
        //unless you use an accessor or mutator
        
        //////////////////////////
        
        //This is different from when two classes just “associate” with
        //one another
        
        /*
        This means one class
        has a reference (like a
        variable, or a method
        call, etc.) to another
        class but not an
        inheritance relationship
        
        
        This is casually called
        a “has a” relationship,
        or “association” or
        “usage” of one class
        with another
        
        you usually do this when initalizing a class
        */
    }
}
