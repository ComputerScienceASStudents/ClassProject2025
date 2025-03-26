/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

/**
 *
 * @author franz
 */
public class ClassTest { //naming classes must have caps on first letter 
                         // with camel casing
    
    //the properties were either private or public to enforce the
    //concept of encapsulation, they are used for “data hiding” and are defined
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public String name;
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     * 
     * 
     * Hidden (private) methods are usually called
     * utility or helper methods as they only perform actions
     * inside the class to help out the other methods
     * 
     * 
     * Private: restricts the access to the class itself, and only methods
     * that are part of the same class can access private properties
     */
    private int age;
    
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     * 
     * 
     * Protected: allows the class itself and all its subclasses to access
     * the property
     */
    protected boolean isAlive;
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors.
     * 
     * if there is only one constructor method that needs arguments to be passed
     * then u cant instantiate a class using a default way
     * 
     * 
     * This is exactly what is happening, and a constructor method is
     * called when you instantiate an object of a class
     */
    public ClassTest() {
        name    = "Jane D'Oh";
        age     = 0;
        isAlive = true;
        
        
        StaticDataTest staticdatatest = new StaticDataTest();
        //Class object/instance = new constructor method
        
        StaticDataTest.veryStat = 10; //u can access static methods
        
        
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(this.toString());
    }
    
    /**
     * A mutator method to "change" (or mutate) the private property of this 
     * class which cannot be changed outside the class
     * 
     * @param age the new age to mutate (set) the property to
     */
    public void setAge(int age) {
        // A programmer could potentially write error checking code here..
        //this
//        keyword as
//        well, which
//        (as a
//        reminder) is a
//        word that
//        makes a
//        reference to a
//        class object
        //this refers to the current class
        //instance object
        this.age = age;
    }
    
    /**
     * A accessor method to "access" (or read) the private property of this 
     * class which cannot be read outside the class
     * 
     * @return the object's current age value to "see" (access)
     */
    public int getAge() {
        return this.age;        // The encapsulated ("private") property
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person: " + name + " is " + age + " is " + isAlive;
    }
}
