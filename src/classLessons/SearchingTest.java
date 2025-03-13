/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classLessons;

/**
 *
 * @author franz
 */
public class SearchingTest {
    
    public SearchingTest() {
        
        String[] arr = {
            "gaming",
            "ayayaya",
            "mogus",
            "jaja"
        };
        //item to search for
        String item = "jaja";
        
        //simple result
        boolean result = search(arr, item);
        
        if (result) {
            System.out.println("found item");
        }
        else {
            System.out.println("not found");
        }
        
    }

    private boolean search(String[] arr, String item) {
        //traverse through 
        //using loop
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i].equals(item)) {
                return true;
            }
        }
        
        
        return false;
    }
}
