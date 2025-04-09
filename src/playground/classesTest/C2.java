/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground.classesTest;

/**
 *
 * @author franz
 */
public class C2 extends C1 {
    
    //data types are not overridden
    public String e = "qwqweqw";

    public C2(String a, String y) {
        System.out.println(a + y);
    }
    
    public void bbb() {
        super.bbb();
        System.out.println("no");
    }
    
    public void heg() {
        //super.heg();
        System.out.println("nono");
    }
    
    public void check() {
        pubpub();
    }
}
