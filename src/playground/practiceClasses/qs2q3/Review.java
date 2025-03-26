/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground.practiceClasses.qs2q3;

/**
 *
 * @author franz
 */
public class Review {

    private int rating; //users rating of website
    private String comment;
    
    public Review(int r, String c) {
        rating = r;
        comment = c;
    }
    
    public int getRating(){
        return rating;
    }
    
    public String getComment() {
        return comment;
    }
    
}
