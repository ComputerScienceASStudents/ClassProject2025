/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground;

/**
 *
 * @author franz
 */
public class DumbStuff {

    public DumbStuff() {
        String temp = "amogamog!";
        
        //use contains not equals (it asks you if the string equals this and not
        //contains)
        if (temp.endsWith(".") || temp.endsWith("!")) {
            System.out.println(temp);
        }
        
        
        int[] arr = new int[4];
        arr[0]++;
        arr[2]++;
        for(int x : arr) {
            System.out.println(x);
        }
        
        
    }
}
