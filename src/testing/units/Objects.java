/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Java packages are a
//mechanism to group Java classes that are related to each other, into the
//same "module" (package)
//When a Java project grows bigger, for instance an app or API, it is useful to
//split the code into multiple Java classes, and the classes into multiple Java
//packages
//Classes can have the same identifier name as long as they are in different
//packages (other programming languages use a similar system called
//“namespaces”)
//A Java package is like a directory in a file system, in fact, on the disk a
//package is a directory, and all Java source and class files of classes
//belonging to the same package are located in the same directory
//Java packages can contain sub packages – and Java packages can thus
//make up what is called a package structure (a Java package structure is like
//a directory structure on your hard drive, or as directories inside a JAR files
package testing.units;

import java.util.Random;

/**
 * introduces a new type of data, the
 * class type of reference data
 * 
 * Class data allows real-world objects to be represented in
 * varying degrees specific to a programmer’s purpose
 * 
 * Main difference between objects and classes are 
 * Object is an instance of a class.
 * Class is a blueprint or template from which objects are created.
 * 
 * Objects are specific and classes are general
 * ex String a = "yes"; a is an object which is an instance 
 * String is an object which can be called multiple times to create more
 * instances
 * 
 * 
 * Every class has Object as a superclass – all objects (including arrays)
 * inherits the methods of this class
 * every inherited methods are
 * equals(Object object) – Indicates whether some other object is "equal to"
 * this one
 * toString() – returns a string representation of the object
 * clone() – creates and returns a copy of this object
 * 
 * @author franz
 */
public class Objects {

    

    

    
    //classes can be simplified to its properties and methods
    //the "adjectives" and "verbs"

    //Properties are descriptors describing (remembering) things about the
    //object
    //using variables
    public String name;

    /*
    In Computer Science terms, the properties (describing the
    object, its attributes, the adjectives, etc.) need to remember data
    so they can essentially be written as variables (including more
    complex data structures like arrays)
    */
    private int age;

    //Methods (or functions) are the actions the object can do
    
    //Constructor methods are special methods that are called when an object of
    //a class is created
    public Objects() {
        
     //Notice the ( ) brackets at the end of the line – hinting that a method is
     //being called?
//   Constructor methods are automatically invoked (called)
//   whenever an instance of a class (an object) is created, such
//   as in the main method of the other class:
        Random random = new Random();
        
        
        /**
            However, the way constructor methods are written has 3
            distinct differences with other methods:
            1. The name of the method matches the name of the
            class
            2. This means it starts with a capital letter
            3. It has no return type (not even the word void)
         */
        
        //the thing with constructor methods is that you can set the values to 
        //default instead of already instantiating them outside the method
        name = "person";
        age = 0;
        
        testMethod();
        randomTest();
    }
    
    /**
     * Classes can contain more than one constructor
     * essentially giving the user "options"
     * 
     * If your constructor has no parameters, it is called a default constructor
     * 
     * @param name
     * @param age 
     */
    public Objects(String name, int age) {
        this.name = name; //this. refers to the variable "name" in the class
        this.age = age;
    }
    
    /**
     *  In any software development process, the creation
        of methods (or functions or procedures) play a
        crucial role since they allow the decomposition of
        the program into logical units or modules
     */
    public void methud() {
        
    }
    
    /*
    
    If you do not write a default constructor, the class can be instantiated
    without one, but if you write a constructor with parameters and no default
    constructor, then you cannot instantiate the class in the “default” way and
    must use the constructor(s) with parameters
    */
    
    
    ////////////////////////////////////////////////////////////////////////////
    //calling void methods
    ////////////////////////////////////////////////////////////////////////////
    
    //Void methods do not have return values and are therefore not
    //called as part of an expression
    
    /**
     * 
     * The static keyword in java is used mainly for memory
       management (i.e. to save memory)
     */
    public static void methmethod() {
        System.out.println("method is called");
    }
    
    /**
     * If you declare any data structure as static, it is known
        static data structure, and if used with methods, they
        are called static methods
        The static data structure gets memory only once in
        class area at the time of the application loading
        A static method can be invoked without the need for
        creating an instance of a class, and static methods can
        access static data structures and can change the value
        of it
        * 
        * 
        * The static keyword means the “thing” the static modifier is being
        applied to (e.g. data structure or method) “belongs” to the class
        rather than the object(s) of that class
        * 
        * reminder - ask what static is
     */
    
    public static String example = "yes";
    
    
    //void methods with parameters/arguments
    
    /**
     * A method often needs data in order to complete
        its task
        The data is given to the method (or passed to
        it) by enclosing it in the parenthesis  (data)
        This allows the programmer to use methods
        and not know what the code is, but give it data
        and get a result

        You have already been doing this with the built-
        in methods of the swing library’s JOptionPane

        class with: showInputDialog
        * 
        * 
        * methods are user-defined methods
        * 
     * @param ex1
     * @param ex2 
     */
    public static void metWithPara (String ex1, int ex2) {
        //values passed into the method are ARGUMENTS
        //values like ex1 and ex2 are PARAMETERS
        
        
        
        
    }
    
    //how 2 declare methods
    //test method for metWithPara's sake
    public static void testMethod() {
        
        //ORDER COUNTS, if you declare a method with an
//      int then a char, then you must call it with an
//      int then a char, or a compile error will occur

        //correct
        metWithPara("ssss", 12);
        
        //wrong
        //metWithPara(0, "example");
        
        add(example, example);
        add(1, 4);
        add(1, 6.5);
        
        stringTest();
        
        wrapperClasses();
        
    }
    
    /*
    OVERLOADING means that you create more
    than one method with the same name
    
    Each method can have the same name,
    but a different distinct parameter list, that
    Java can use to determine which form of
    the method you wish to use
    
    */
    
    //for example - adding 2 same data types together
    //refer to testmethod for tests
    
    
    /**
     * outputs a and b together
     * in this case adding two yes together
     * 
     * @param a
     * @param b 
     */
    public static void add(String a, String b) {
        System.out.println(a + " " + b);
    }
    
    /**
     * adds two ints and outputs it
     * 
     * @param i
     * @param i0 
     */
    public static void add(int i, int i0) {
        System.out.println(i + i0);
    }
    
    /**
     * adds two ints and outputs it
     * 
     * @param i
     * @param i0 
     */
    public static void add(int i, double d) {
        
        double a = i + d;
        
        System.out.println(a);
    }
    
    
    
    //calling non void methods
    //when declaring non void methods you must MUST have a return value
    //thats because the method returns data the user is requesting
    
    /**
     * the method must specify what type the method returns
     * 
     * void doesnt return anything 
     * 
     * @param a
     * @param b
     * @return 
     */
    public static double divide(double a, double b) {
        double result;
        
        result = a/b;
        
        return result;
    }
    
    /*
        You use comments in methods just as in other code to
        clarify what the method will be doing
        The documentation of methods will now be expected (and
        marked) on all programmer-defined methods you write
        The traditional way to document methods could include up
        to 4 things:
        1. PURPOSE: A brief description of what the method is
        doing - must be brief

        2. PRE: The preconditions - requirements
        3. POST: The post conditions - how it works 
        4. CALLS: Any other methods this method calls
    */
    
    
    /*
        programming techniques or steps to make methods
        
        evaluate - know the problem and what the method does
        design - know what the method is (data types, returns, parameters)
        code - write the method
        test/debug - see if method works
        documentation - add comments
    */
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //strings
    ////////////////////////////////////////////////////////////////////////////
    
    public static void stringTest() {
        
        //String are used to hold *strings* of data (specifically char)
//     Declaration of string variables uses a Capital letter in the front of the
//      word String because it references a class
        String test = "testing";
        //String is essentially a class that adds a variety of functions
        System.out.println(test.charAt(0));
        
        //Declaration of string variables uses a Capital letter in the front of 
        //the word String because it references a class
        
//        Concatenation can be done on strings but is done with the +
        //operator, and it does not do addition, it concatenates (joins together)
        //the strings
        test = "test " + "test"; //concatenation doesnt give spaces to the joint
        //string
        
        
                                 
        //substring cuts out a portion of the string                   
        System.out.println(test.substring(0, 2));
        
        String result = test + " word1";
        //indexof finds the first occurence of the string - it finds an instance
        //and outputs the "location" where it first starts
        //this outputs zero because of the fact that index of finds it at postio
        //1 and indexing starts at zero
        System.out.println(result.indexOf(test));
        
        
        //Strings can be concatenated with primitive types
        int y = 10;
        System.out.println("the the thehthethe thehheth " + y + " e " + (y+10));
        
//        Converting string to numerical variable types can be
//        done using the second method known as parsing

        String age = "30";
        //to parse it YOU MUST use the same data type declared
        int stringconv = Integer.parseInt(age);
        
        //Strings can also be used in other ways, like converting them to
    //    chars, comparing them (see if they are equal), getting their
    //    length, and other things
        
        stringMethods();
        
    }
    
    public static void stringMethods() {
        /*
        In Java basic arithmetic operations can be done with the standard
        operators (+,-,/,*), but more advanced math operations
        can be done as well using a built-in math code library
        
        This is the Math library and it is built right into the Java
        language
        */
        
        int numero = -5;
        int answer = Math.abs(numero); 
        //The word 'Math' is used to invoke the built-in class
        //funct/method abs returns an absolute value
        
        //there are many others such as pow (power of) and sqrt (square root)
        //make sure to use int or double to where it deems fit
        System.out.println(answer);
    }
    
    /**
     * “Black Box”
        programming
        Meaning we put the data into a “Black Box” –
        the method

        And without knowing how the method was
        coded, we get the result we wanted
        This is the
        magical
        “Black Box”
        * 
        * 
        * the name of the method usually hints to what the method does
        * this is why u should name ur methods correctly
     */
    
    private static void wrapperClasses() {
        
        //In Java arithmetic operation should always be done on
        //variables of the same type
        //When performing arithmetic on two different types the result is
        //indeterminate
        
        //To perform math on different variables types, conversion to one set
        //type must be done
        double y = 7.8;
        int x = (int)y;
        //casting disregards the .8 and doesnt round it up
        
        
        //the difference between casting and parsing is casting can only be done
        //in numerical data while parsing occurs with strings
        
        //Some data structures require more
//        memory (e.g. doubles require more
//        space than integers) and I would
//        draw them as having larger “boxes”
        

        //What computer memory actually “looks like” is a series of memory
        //locations (addresses) that could be compared to a bunch of mailboxes.
        
        
    }

    private void randomTest() {
        //random creates a random value between -1 and 1 
        
        //random number formula is 
        //(high - low + 1) * random + low
        //so numbers 25 and 60 will result in 
        //36 * random + 25
    }
}
