/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground;

import playground.classesTest.C1;
import playground.classesTest.C2;
import playground.classesTest.DogType;

/**
 *
 * @author franz
 */
public class DumbStuff {

    public DumbStuff() {
        String temp = "amogamog!";
        
        //use contains not equals (it asks you if the string equals this and not
        //contains)
//        if (temp.endsWith(".") || temp.endsWith("!")) {
//            System.out.println(temp);
//        }
//        
//        
//        int[] arr = new int[4];
//        arr[0]++;
//        arr[2]++;
//        for(int x : arr) {
//            System.out.println(x);
//        }
        
        
        C1 c = new C1();
        C1 j = new C2();
        
        //overriding doesnt apply to paramteres of a class
        System.out.println(j.e);
        
        //when adding numbers to string 
        //atrithmetic would not apply unless applied in brackets
        String str = "" + 1 + 2;
        System.out.println(str);
        
        
        str += "pie" + str + "ajems";
        System.out.println(str);
        
        //index returns first occurence of string/char
        System.out.println(str.indexOf("1") + "");
        System.out.println(str.substring(0, 2));
        
        System.out.println("\n\n\n\n");
        
        //intvalue just returns the int of integer class
        Integer o = new Integer(8);
        System.out.println(o.intValue() * 2);
        
        
        int s = 2*2*5;
        
        //double i = 6.0;
        
        //int arithmetic doesnt return a double UNLESS theres a double involved
        System.out.println(s/6);
        
        boolean a = true;
        boolean b = true;
        
        if(a) {
            System.out.println("a");
        }
        //else if only takes occurence IF the first if statement is false
        //also elif disregards the condition at the bottom because it only
        //executes logic inside its own condition
        else if (b) {
            System.out.println("b");
        }
        else {
            System.out.println("eysyeysyesye");
        }
        
        
        String y = new String("yes");
        String p = new String("yes");
        
        //the == sign is used to compare object references
        System.out.println(y == p);
        
        Integer i = new Integer(1);
        Integer q = new Integer(1);
        System.out.println(i == q);
        
        //object references describes a link to the object. not its component
        
        
        String swqeqwe = "asparagus";
        String key = "gus";
        int index = 6;
        
        System.out.println(swqeqwe.substring(index, index + key.length()));
        
        //children will inherit public methods but it cant be used outside the
        //child class
        //DogType d = new DogType();
        //d.mhm();
        
        //printing out the class calls the toString function
        System.out.println(c);
    }
}
