/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

/**
 * Accessors – the get() methods which retrieves
 * (gets) the data (or return it) - dont need to specify method type
 * 
 * Mutators – the set(data) methods which sets the
 * data to a new value (or mutates it into something else) - no specifications
 * of method type
 * 
 * 
 * @author franz
 */
public class AccessorMethods {
    
    private String test = "mamama";
    
    public AccessorMethods() {
        AccessorTest();
        
        MutatorTest();
        
        
        
        
    }

    /**
     * naming style must include a "get"
     */
    private void AccessorTest() {
        System.out.println("" + getPrivatString());
    }

    /**
     * 
     */
    private void MutatorTest() {
        //A good program will contain lots of
        //different methods to perform various tasks
    }

    private String getPrivatString() {
        String output = this.test;
        return output;
    }
}
