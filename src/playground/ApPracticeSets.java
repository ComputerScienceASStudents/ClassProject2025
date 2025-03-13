/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground;

/**
 *
 * @author franz
 */
public class ApPracticeSets {

    public ApPracticeSets() {
        
        //for loop syeysyeyseysye
        String words[] = {"gaming", "king", "ling"};
        
        
        //"for every item(String) in words....
        //no need to put String word = words[i]
        for (String word : words) {
            String a = "";
            a = word.substring(word.length() - 3);
            System.out.println(a);
        }
    }
}
