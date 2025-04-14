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

    public C2() {
        
    }
    
    
    public C2(int numWhe, String a) {
        System.out.println(a);
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
    
    public boolean equals(C2 c){
        
        return true;
    }
    
    public void yesnomhm() {
        System.out.println("yes");
    }
}
