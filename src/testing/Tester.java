/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testing;

import array2d.Array2dTest;
import arrrayListUnit.ALTest;
import arrrayListUnit.ArrList;
import classes.inheritance.InheriTest;
import classes.test.C1;
import classes.test.C2;
import classes.test.ChildTest;
import classes.test.ParentTest;
import classes.test.Thing1;
import classes.test.Thing2;
import classes.test.Thing3;
import testing.units.Arrays;
import testing.units.Iteration;
import testing.units.Objects;
import testing.units.PrimitiveTypes;
import testing.units.Recursion;

/**
 *
 * @author franz
 */
public class Tester {
    //primitive types - data types/variables etc.
//    PrimitiveTypes unit1AP = new PrimitiveTypes();
//    Objects objects = new Objects();
//    Iteration iteration = new Iteration();
    //Arrays arrays = new Arrays();
    //InheriTest inheriTest = new InheriTest();
    //Recursion rec = new Recursion();
    
    //ArrList a = new ArrList();
    Array2dTest j = new Array2dTest();
    //ChallengesTest c = new ChallengesTest();
    public void pW () {
        
    }
    
    public Tester() {
        //NOTE THAT I++ ONLY OCCURS AFTER THE BLOCK OF CODE IS EXECUTED
        
//        for (int i = 0; i <= 3; i++) {
//            for (int j = 1; j <= 5; j+=2) {
//                
//                System.out.println("*");
//                System.out.println("2nd loop index is " + j );
//            }
//            System.out.println("first loop index is " + i + "\n\n");
//        }
//        int n;
//        int i = 1;
//        
//        for (int j = 2; j <= i; j++) {
//            System.out.println("i");
//        }
//        
//        double r = Math.random();
//        
//        int j = (int)r + 1;
        //Thing1 t = new Thing2();
        //t.calc(2);
        
        
        
        //let c2 be parent and c1 be child of c2
        
        
        //upcasting
        /*
        This reference p can access all the methods and variables of the parent
        class but only overridden methods in the child class
        */
//        ParentTest p = new ChildTest(); //Parent parent = new Child();
//        
//        //downcasting
//        ChildTest c = (ChildTest)p; //Child child = (Child)parent;
//        
//        ((ChildTest)p).memememe(); //can also downcast outside intialization
//        System.out.println(((ParentTest)c).name); //can also upcast
//        
//        System.out.println(p.name);
//        System.out.println(c.name); //children can access parent vars
        
        
//        Thing1 t = new Thing2();
//        t.calc(2);
//        
//        //what is this
//        //casting it to thing1 when instance is already thing1
//        t.eat(); //whats the purpose of calling thing 2 constructor


        //Thing1 t = new Thing2(); //so essentially thing2 is converted to thing 1
                                   //the reason why this gets away is because t2
                                   //is a child of t1
                                   
                                   //class object = new constructor method();
        //((Thing2)t).yesyesyeyseysye(); //thing1 is converted to thing2
        //You can use type casting with a hierarchy of classes and subclasses
        //to check the type of a particular class instance and to cast that
        //instance to another class within the same hierarchy
        /*
        This allows the parent class reference (Parent parent) to hold an object of the child class (new Child()).

        Even though parent is declared as Parent, the overridden methods of Child will be called at runtime if they exist.
        */
        
        
//        System.out.println("\n\n\n\n\n\n\n");
//        System.out.println("hello");
//        System.out.print("world");
//        Thing1 t = new Thing1();
//        Thing2 w = new Thing2(); //t1 is not a child of t2
//        Thing3 r = new Thing3();
        
        //child classes inherit the parent's methods
        //w.test(r, r); //
        //t.test(t, r); this doesnt work because arg1 isnt thing2 (as listed in
        //method parameters)
        
        
        
        
    }
}
