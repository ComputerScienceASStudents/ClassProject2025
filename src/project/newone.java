package project;
 
/**
 * newone.java - description
 *
 * @author Thomas.P
 * @since Mar 3, 2025, 10:11:38 a.m.
 */
public class newone 
{

    /**
     * Default constructor, set class properties
     */
    public newone() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "newone: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public newone clone() {
        return this;
    }
    
}