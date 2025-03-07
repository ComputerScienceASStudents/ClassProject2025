/** Required package class namespace */
package collections;

/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object, and could be "visualized" as:
 * 
 *                      NODE
 *                +--------------+
 * previous <---- |              |
 *                |     data     |
 *                |   (generic)  |
 *                |              |----> next
 *                +--------------+
 *
 * @author Jonah Wu
 * @param <T> The generic data type used in the class
 * @since Dec 6, 2023, 10:38:48 a.m.
 */
public class Node <T>
{
    /** The generic data type the node stores */
    public T data;
    
    /** 
     * Self reference (pointer, link) to the next node that 'will' be
     * in a 'chain' (linked list)
     */
    public Node next;
    
    /** Link / pointer / reference to the previous (back) node */
    public Node previous;
       
    /**
     * Default constructor, set class properties
     */
    public Node() {
        this(null,null,null);
        // Instead of code like...
        // data = null;
        // next = null;
        // previous = null;
    }  
    /**
     * Class constructor, sets the class properties
     * @param data the node data (generic)
     */
    public Node(T data) {
        this(data,null,null);
    }   
    /**
     * Class constructor, sets the class properties
     * @param data the node data (generic)
     * @param next reference to the next Node object
     */
    public Node(T data, Node next) {
        // Constructor method calling another constructor method:
        this(data,next,null);        
    } 
    /**
     * Class constructor, sets the class properties. Another option when 
     * creating multiple constructors (overloading) write the constructor with
     * ALL the possible arguments first. You can use other constructors to 
     * call this one.
     * @param data the node data (generic)
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }    
    /**
     * String representation of this object
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        String text = "data: ";        
        // Display the data stored in the node (or null)
        if (data == null) {
            text += "null";
        }
        else {
            text += data.toString();
        }        
        // Display the connection ("link") to the next node
        text += "\t next: ";
        if (next == null) {
            text += "null";
        }
        else {
            text += next.data.toString();
        }       
        // Display the connection ("link") to the previous node
        text += "\t previous: ";
        if (previous == null) {
            text += "null";
        }
        else {
            text += previous.data.toString();
        }       
        // Add the memory address (from the Object super-class)     
        // Get memory address
        String value = super.toString();    
        // Find where it begins        
        int begin = value.indexOf("@") + 1;  
        // Length of string
        int end   = value.length();              
        // Get sub-string
        value = value.subSequence(begin, end).toString();   
        // Add to text
        text += "\t Address: " + value;                    
        // Return all the text compiled
        return text;
    }  
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Error check first for nulls appearing whcih could cause crashes
        if (this.data == null) {
            return false;
        }    
        if (object == null) {
            return false;
        }    
        // Convert (cast) the object parameter into a "Node" object
        Node that = (Node)object;
        if (that.data == null) {
            return false;
        }  
        // Now compare both data properties
        return this.data.equals(that.data);
        // Same kind of code as...
        // T dataFromThisClass = (T)this.data;
        // T dataFromParameter = (T)that.data;        
        // if (dataFromThisClass.equals(dataFromParameter)) {
        //     return true;
        // }
        // else {
        //     return false;
        // }
    }      
    /**
     * a Deep clone, creates a duplicate object using new memory
     * @return a "clone" of the object using new memory
     */
    @Override
    public Node clone() {
        // Annoynmous clone object created and returned
        return new Node(this.data, this.next, this.previous);
    }   
    /**
     * Frees up all memory used by this object, and it is called when this 
     * object is "deleted" or "removed" or "destroyed"
     */
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
        // Garbage collector
        System.gc();
    }  
}