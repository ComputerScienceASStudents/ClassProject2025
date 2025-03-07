/** Required package class namespace */
package collections;

/** Required API imports */
import java.lang.reflect.Array;
 
/**
 * LinkedList.java - an implementation of a linked list abstract (advanced)
 * data (dynamic) type (ADT) and useful methods. A linked list is a collection
 * of data objects "linked together" and where each object maintains a 
 * reference (a "pointer") to the next object in the list. This is different 
 * from an array where we have one identifier referencing all the items. This 
 * is useful because each object (each spot) is connected to the next spot 
 * like a chain. If we also use each "spot" to store data, we have a structure
 * like an array that stores multiple data items, but where we can add and 
 * remove "spots" from the chain. It could be "visualized" as:
 * 
 *             +------+       +------+       +------+       +------+      
 *  null <---- |      | <---- |      | <---- |      | <---- |      |  
 *             | NODE |       | NODE |       | NODE |       | NODE |       
 *             |      |---->  |      |---->  |      |---->  |      |----> null  
 *             +------+       +------+       +------+       +------+      
 *                 ^                                           ^
 *                 |                                           |
 *                head                                        tail
 *
 * @author Jonah Wu
 * @param <T> The generic data type used in the class
 * @since Dec 6, 2023, 10:38:11 a.m.
 */
public class LinkedList <T>
{  
    /** 
     * The number of nodes in the list, cannot be changed outside the class,
     * so it is an immutable encapsulated property
     */
    private int length;
    
    /** Reference (link) to the first (front) node in the list (entry point) */
    private Node head;
    
    /** Reference (link) to the last (back) node in the list (entry point) */
    private Node tail;
    
    /** Flag to indicate a search was not found */
    public final int NOT_FOUND = -1;
    
    /**
     * Default constructor, set class properties
     */
    public LinkedList() {
        finalize();
    }   
    /**
     * Frees up all memory used by this object (Note: when you add the "final"
     * modifier keyword to the method signature, it make it so that this method
     * can NOT ever be overloaded)
     */
    @Override
    public final void finalize() {
        length = 0;                 
        head = tail = null;         
        System.gc();
    }    
    /**
     * Accessor method for the number of nodes in the list (the length is a 
     * immutable encapsulated property of the class) - no mutator method will
     * be written (so 'length' remains a read-only property from outside the 
     * class) 
     * @return the number of nodes in the list
     */
    public int size() {
        return length;
    }    
    /**
     * Determines if the list is empty (no nodes) or not 
     * @return it is empty (true) or it does contain some data (false)
     */
    public boolean isEmpty() {        
        return length == 0;        
    }   
    /**
     * Accessor method to the encapsulated (private) property of the first
     * (head) node of the list
     * @return reference to the first node
     */
    protected Node getFirstNode() {
        return head;
    }   
    /**
     * Accessor method to the encapsulated (private) property of the last
     * (tail) node of the list
     * @return reference to the last node
     */
    protected Node getLastNode() {
        return tail;
    }    
    /**
     * A protected (can be called inside the class and by any children of this
     * class) accessor method to retrieve a node reference (link, pointer, 
     * address, etc.) to the passed index location (using an array style of
     * indexing) 
     * @param index the subscript, location, spot, index value
     * @return a reference (not the data) to the node at this location or null
     */
    protected Node getNode(int index) {
        if (!inRange(index)) {
            // Not valid index
            return null;
        }             
        if (index == 0) {
            // First node returned
            return getFirstNode();
        }   
        if (index == length-1) {
            // Last node returned
            return getLastNode();
        }    
        // Start at first node
        Node current = head;         
        // Move to index
        for (int i = 0; i < index; i++) {        
            // Advance reference
            current = current.next;                     
        }
        // Return reference
        return current;                                 
    }    
    /**
     * A private (encapsulated or "help") method to error check to see if the
     * index is in range (or "in bounds") of the list
     * @param index the location (element, subscript) to check
     * @return it is in range (true) or not (false)
     */
    private boolean inRange(int index) {
        if (isEmpty()) {
            return false;
        }
        if (index < 0) {
            return false;
        }
        if (index >= length) {
            return false;
        }  
        return true;
    }       
    /**
     * String representation of this object
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty LinkedList";
        }
        String text = "LinkedList [";            
        // Start a reference (link) at the first (head) node (entry point)
        Node current = head;        
        // Traverse (travel) the list
        while (current.next != null) {          
            // Appending the node data to the string and a seperator comma
            text += current.data.toString() + ",";   
            current = current.next;                   
        }
        return text + current.data.toString() + "]";                                                    
    }  
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Cast object parameter
        LinkedList<T> that = (LinkedList<T>)object;             
        if (this.size() != that.size()) {
            return false;
        }
        // Get reference to
        Node current1 = this.getFirstNode();  
        // Nodes in each list
        Node current2 = that.getFirstNode();  
        // Traverse lists
        while (current1 != null) {        
            // Not equal data
            if (!current1.equals(current2)) {            
                return false;      
            } 
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }     
    /**
     * Inserts (adds) data (generic type) into the back (tail, end, etc) of
     * this list
     * @param data the generic type to add in
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBack(T data) {
        if (data == null) {
            // null data cannot be added
            return false;
        }        
        // new (memory) Node object created
        Node<T> node = new Node<>(data);           
        // General programmer scenarios to consider:
        //  (1) Typical case - what does a 'normal' user do?
        //  (2) Edge case(s) - what if we pushing the edge/limits?
        //  (3) Beyond the edge - what if we try to intentially crash this?        
        // Scenarios for this method to consider:
        //  (1) Empty list
        //  (2) List of 1 or more nodes  
        // Adding first node
        if (isEmpty()) {          
            // Set LinkedList references
            head = tail = node;             
        }
        // Subsequent nodes added
        else {      
            // Link node to rest of list
            node.previous = tail;    
            // Connect rest of list to node
            tail.next = node;        
            // Reassign tail reference
            tail = node;                    
        }
        length++;
        // Operation successful
        return true;                        
    }    
    /**
     * Inserts (adds) data (generic type) into the front (head, start, etc) of
     * this list
     * @param data the generic type to add in
     * @return the operation was successful (true) or not (false)
     */
    public boolean addFront(T data) {
        if (data == null) {
            return false;
        }    
        Node<T> node = new Node<>(data);  
        if (isEmpty()) {              
            head = tail = node;        
        }
        else {                           
            node.next = head;             
            head.previous = node;          
            head = node;                  
        }
        length++;                       
        return true;                     
    }       
    /**
     * Accessor for the data at the specified index
     * @param index the index location to access
     * @return the data (or null) at the index
     */
    public T get(int index) {
        // Invalid index, return flag
        if (!inRange(index)) {
            return null;
        }           
        // Get reference and retrieve data
        return (T)getNode(index).data;        
    }   
    /**
     * Mutator method sets the index location to the new data
     * @param index the index location to mutate
     * @param data the new data to mutate into
     * @return the operation was successful (true) or not (false)
     */
    public boolean set(int index, T data) {
        if (!inRange(index)) {
            return false;
        }      
        if (data == null) {
            return false;
        }        
        // Get to node at index
        Node current = getNode(index);    
        // Change node data
        current.data = data;                        
        return true;
    }   
    /**
     * a Deep clone, creates a duplicate object using new memory
     * @return a "clone" of the object using new memory
     */
    @Override
    public LinkedList clone() {
        // Create new list memory
        LinkedList<T> that = new LinkedList<>();  
        // Traverse list
        for (int i = 0; i < this.length; i++) {     
            that.addBack((T)this.get(i));
            // This one line is the same as...
            // T data = (T)this.get(i);
            // that.addBack(data);
        }        
        return that;
    } 
    /**
     * Inserts data as a new node after the passed index 
     * @param data the data type to insert
     * @param index the index location to insert after
     * @return the operation was successful (true) or not (false)
     */
    public boolean addAfter(T data, int index) {
        // First error check the data and index values
        if (data == null) {
            return false;
        }     
        if (!inRange(index)) {
            return false;
        }              
        // The simple index number calls a method we already have
        // Add to the end
        if (index == length-1) {
            return addBack(data);
        }     
        Node<T> node = new Node<>(data);                
        Node current = getNode(index);        
        // Next, set all 4 proper references to insert the new node
        node.next = current.next;                       
        current.next.previous = node;
        current.next = node;
        node.previous = current;       
        // Finishing up, add to lenght class property and return successfull
        length++;                                     
        return true;                          
    }  
    /**
     * Inserts data as a new node before the passed index
     * @param data the data type to insert
     * @param index the index location to insert before
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBefore(T data, int index) {
        if (data == null) {
            return false;
        }          
        if (!inRange(index)) {
            return false;
        }       
        if (index == 0) {
            return addFront(data);
        }          
        Node<T> node = new Node<>(data);        
        Node current = getNode(index);          
        // Copy and paste the addAfter method and then applied "dual" opperation
        // logic on all the references below ("next" becomes "previous", etc.)
        node.previous = current.previous;                       
        current.previous.next = node;
        current.previous = node;
        node.next = current;
        length++;                                 
        return true;    
    }   
    /**
     * Adds the data to the back of the list (wrapper method)
     * @param data the data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data) {
        // Wrapper method call
        return addBack(data);                           
    }    
    /**
     * Adds the data before the passed index (wrapper method)
     * @param data the data to add
     * @param index the index location to add before
     * @return the operation was successful (true) or not (false)
     */
    public boolean add(T data, int index) {
        return addAfter(data, index);    
    }    
    /**
     * Accesses the first, head, front data in the list
     * @return the head data
     */
    public T front() {
        // First node
        return get(0);                              
    }   
    /**
     * Accesses the last, tail, back data in the list
     * @return the tail data
     */
    public T back() {
        // Last node
        return get(length - 1);                       
    }   
    /**
     * Wipes out all memory of all contents of the list
     */
    public void clear() {
        Node current = head;                
        while (current != null) {        
            Node next = current.next;  
            // Wipe all memory from the node
            current.finalize();             
            current = next;                 
        }
        // Wipe all memory from the list
        finalize();      
        System.gc();
    }   
    /**
     * Removes (deletes) the first (head) node of the list (mutator method)
     * @return the data in the first node (or null)
     */
    public T removeFront() {
        // No front to remove
        if (isEmpty()) {
            return null;
        }             
        // Store head data
        T data = front();     
        // One node list, wipe list
        if (length == 1) {
            finalize();
        }            
        else {                
            // Advanced head reference
            head = head.next;         
            // Cut old head reference
            head.previous.next = null;    
            // Cut reference to old head
            head.previous = null;          
            // Reduce list length
            length--;                           
            System.gc();
        }        
         // Return stored data
        return data;                           
    }    
    /**
     * Removes (deletes) the last (tail) node of the list
     * @return the data in the last node (or null)
     */
    public T removeBack() {
        if (isEmpty()) {
            return null;
        }         
        // Store tail data
        T data = back();                        
        if (length == 1) finalize();      
        else {                
            tail = tail.previous;        
            tail.next.previous = null;       
            tail.next = null;            
            length--;                      
            System.gc();                   
        }
        return data; 
    }   
    /**
     * Deletes the node at the specified index and mutates the list
     * @param index the index location to remove
     * @return the data at the specified index (or null)
     */
    public T remove(int index) {
        if (!inRange(index)) {
            return null;
        }        
        if (index == 0) {
            return removeFront();
        }
        if (index == length-1) {
            return removeBack();
        }   
        Node current = getNode(index);              
        // Change references
        current.next.previous = current.previous;       
        current.previous.next = current.next;
        current.next = current.previous = null;        
        length--;                            
        // Return index data
        return (T)current.data;                         
    } 
    /**
     * Checks (searches) if the specified data is inside the list
     * @param data the data to check for
     * @return data is in the list (true) or not (false)
     */ 
    public boolean contains(T data) {
        if (data == null) {
            return false;
        }        
        Node current = head;            
        while (current != null) {        
            // Found first occurrence
            if (current.data.equals(data)) {    
                return true;             
            }
            current = current.next;      
        }
        // Not found in list
        return false;                           
    }     
    /**
     * Finds the node matching the data at the first occurrence in the list
     * and returns it's index or -1 (NOT_FOUND) if not in the list 
     * @param data the node data to search for
     * @return index of first occurrence or -1 (NOT_FOUND)
     */
    public int firstIndexOf(T data) {
        if (data == null) {
            return NOT_FOUND;
        }  
        Node current = head;            
        // Start count at 0
        int index = 0;                          
        while (current != null) {            
            if (current.data.equals(data)) {  
                // Return location
                return index;                   
            }
            current = current.next;           
            index++;                        
        }
        return NOT_FOUND;              
    }   
    /**
     * Finds the node matching the data at the last occurrence in the list
     * and returns it's index or -1 (NOT_FOUND) if not in the list 
     * @param data the node data to search for
     * @return index of last occurrence or -1 (NOT_FOUND) 
     */
    public int lastIndexOf(T data) {
        if (data == null) {
            return NOT_FOUND;
        }  
        Node current = tail;            
        // Start count at total nodes
        int index = length - 1;                   
        while (current != null) {          
            // Found last occurrence
            if (current.data.equals(data)) {    
                return index;                  
            }
            current = current.previous;   
            index--;                         
        }
        return NOT_FOUND;   
    }   
    /**
     * The number of instances this data occurs in the list 
     * @param data the data to search for
     * @return the number of instances of the data
     */
    public int numberOf(T data) {
        if (data == null) {
            return 0;
        }       
        // Start a counter
        int counter = 0;                        
        Node current = head;                   
        while (current != null) {         
            // Item found in list
            if (current.data.equals(data)) {    
                counter++;                     
            }
            current = current.next;             
        }
        return counter;                      
    }   
    /**
     * Accesses all occurrences of the passed data in the list and returns an
     * integer array containing all index values the data occurred at 
     * @param data the data to search for
     * @return all indices location in an array or null if no indices
     */
    public int[] allIndices(T data) {
        if (data == null) {
            return null;
        }
        // No data in the list
        if (!contains(data)) {
            return null;
        }       
        // Get number of occurrences
        int size = numberOf(data);     
        // Create array
        int[] array = new int[size];             
        Node current = head;                  
        int counter = 0;                  
        for (int i = 0; i < length; i++) {   
            // Item encountered
            if (current.data.equals(data)) {    
                // Insert index into array
                array[counter] = i;             
                counter++;                 
                if (counter >= size) {
                    return array;
                }
            }
            current = current.next;    
        }
        return array; 
    }   
    /**
     * Deletes the first occurrence of the data in the list
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean remove(T data) {
        if (data == null) {
            return false;
        }
        int index = firstIndexOf(data); 
        if (index == NOT_FOUND) {
            return false;
        }
        remove(index);                      
        return true;      
    } 
    /**
     * Deletes the last occurrence of the data in the list 
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false) 
     */
    public boolean removeLast(T data) {
        if (data == null) {
            return false;
        }   
        int index = lastIndexOf(data);       
        if (index == NOT_FOUND) {
            return false;
        }  
        remove(index);                       
        return true;                        
    }   
    /**
     * Deletes all occurrences of the data in the list
     * @param data the node data to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T data) {
        if (data == null) {
            return false;
        }    
        if (!contains(data)) {
            return false;
        }     
        // Loop continuously
        while(contains(data)) {       
            // Removing the data
            remove(data);                       
        }
        return true;
    }  
    /**
     * Deletes all occurrences of the different data items in the array 
     * from the list
     * @param items the node data array items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(T[] items) {
         if (items == null) {
             return false;
         }   
         if (items.length == 0) {
             return false;
         } 
         // Remove array item in advanced for loop
         for (T item : items) {                 
             removeAll(item);                   
         }
         return true;                   
    }   
    /**
     * Deletes all occurrences of the different data items in the passed
     * list from the current list
     * @param list the LinkedList of items to remove
     * @return the operation was successful (true) or not (false)
     */
    public boolean removeAll(LinkedList<T> list) {
        if (list == null) {
            return false;
        }        
        if (list.isEmpty()) {
            return false;
        }      
        for (int i = 0; i < list.size(); i++) {  
            removeAll(list.get(i));                 
        }
        return true;                       
    }   
    /**
     * Checks the list to see if it contains all the items in the array
     * @param items the node data array items to check
     * @return all items are in the array (true) or not (false)
     */
    public boolean containsAll(T[] items) {
        if (items == null) {
            return false;
        }  
        if (items.length == 0) {
            return false;
        }  
        for (T item : items) {                  
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }    
    /**
     * Checks the list to see if it contains all the items in the array
     * @param list the LinkedList of items to check
     * @return all items are in the list (true) or not (false)
     */
    public boolean containsAll(LinkedList<T> list) {
        if (list == null) {
            return false;
        }       
        if (list.size() == 0) {
            return false;
        }       
        for (int i = 0; i < list.size(); i++) {  
            if (!contains((T)list.get(i))) 
                return false;                     
        }
        return true;                               
    }            
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * @param items the array to append on
     */
    public void addAll(T[] items) {
        if (items == null) {
            return;
        }               
        for (int i = 0; i < items.length; i++) {   
            this.add(items[i]); 
        }
    }  
    /**
     * Appends all the items from the passed list to the end of the 
     * current list
     * @param list the Linked list to append on
     */
    public void addAll(LinkedList<T> list) {
        if (list == null) {
            return;
        }                
        for (int i = 0; i < list.size(); i++) {   
            this.add(list.get(i));             
        }
    }  
    /**
     * Appends all the items from the passed list into the current list 
     * after the passed index
     * @param items the array to append on
     * @param index the index location to append from
     */
    public void addAll(T[] items, int index) {
        // Double error check
        if (items == null) {
            return;
        }               
        if (!inRange(index)) {
            return;
        }               
        for (int i = 0; i < items.length; i++) {    
            this.addAfter(items[i], index);         
            index++;                                
        }
    }  
    /**
     * Appends all the items from the passed list into the current list 
     * after the passed index
     * @param list the Linked list to append on
     * @param index the index location to append from
     */
    public void addAll(LinkedList<T> list, int index) {
        if (list == null) {
            return;
        }             
        if (!inRange(index)) {
            return;
        }            
        for (int i = 0; i < list.size(); i++) {    
            this.addAfter(list.get(i), index);     
            index++;                       
        }
    }   
    /**
    * Accesses a sub list from the main list based on the passed parameters
    * @param from the index to start the sublist from
    * @param to the index to end the sub list at
    * @return a sub list from the main list
    */
    public LinkedList<T> subList(int from, int to) {
        if (!inRange(from)) {
            return null;
        }          
        if (!inRange(to)) {
            return null;
        }          
        // Index not in line
        if (from > to) {
            return null;
        }            
        LinkedList<T> list = new LinkedList<>();   
        for (int i = from; i <= to; i++) {       
            // Add to list from list
            list.add(this.get(i));                  
        }
        // Return new list
        return list;                                
    }    
    /**
     * Mutates the list into a list only matching the contents of the array
     * @param array the data objects to form the list from
     */
    public final void fromArray(T[] array) {
        if (array == null) {
            return;
        }              
        finalize();                                 
        for (T item : array) {                 
            add(item);                 
        }
    }   
    /**
     * Mutates list into a list only matching the contents of the other list
     * @param list the data objects to form the list from
     */
    public final void fromLinkedList(LinkedList<T> list) {
        if (list == null) {
            return;
        }                
        finalize();                           
        for (int i = 0; i < list.size(); i++) {   
            add(list.get(i));                  
        }
    }  
    /**
     * Returns an array that contains the same data as the list
     * @param array the data type array
     * @return an array of generic type T
     */
    public T[] toArray(T[] array) {
        if (array == null) {
            return null;
        }
        // Create empty array
        array = (T[])(Array.newInstance(array.getClass().getComponentType(), length));   
        // Traverse list
        for (int i = 0; i < length; i++) {   
            // Add to array
            array[i] = get(i);                  
        }
        // Return completed array
        return array;                           
    } 
    /**
     * Constructor instantiates list from the passed data
     * @param array the data objects to create the list from
     */
    public LinkedList(T[] array) {
        fromArray(array);
    }
    /**
     * Constructor instantiates list from the passed data 
     * @param list the data objects to create the list from
     */
    public LinkedList(LinkedList<T> list) {
        fromLinkedList(list);
    }
}