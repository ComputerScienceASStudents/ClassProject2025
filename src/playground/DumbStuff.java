/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground;

import playground.classesTest.C1;
import playground.classesTest.C2;

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
        System.out.println(j.e);
        
        //when adding numbers to string 
        //atrithmetic would not apply unless applied in brackets
        String str = "" + 1 + 2;
        System.out.println(str);
        
        str += "pie" + str + "ajems";
        System.out.println(str);
        
        System.out.println(str.indexOf("1"));
        System.out.println(str.substring(0, 2));
        
        System.out.println("\n\n\n\n");
        
        Integer o = new Integer(8);
        System.out.println(o.intValue() * 2);
        
        
        int s = 2*2*5;
        
        System.out.println(s/6);
        
        
    }
}
