/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground.practiceClasses.qs2q3;

import java.util.ArrayList;

/**
 *
 * @author franz
 */
public class ReviewAnalysis {

    //all reviews compiled here
    private Review[] allReviews;
    
    public ReviewAnalysis() {
        
    }
    
    public double getAverageRating() {
        //avg is sum of all numbers / the count of the nums
        
        double avgRating = 0;
        
        /*
        cycles through each review class and accesses the rating and stores it
        to avgRating
        */
        for (Review rev : allReviews) {
            avgRating += rev.getRating();
        }
        
        //im lazy to calculate outside return statement so yes
        return avgRating / allReviews.length;
    }
    
    /**
     * collects and formats comments with excalamation point
     * returns arraylist of string objects
     * 
     * @return 
     */
    public ArrayList<String> collectComments() {
        
        //VARIABLES
        //arr is arraylist of comments that meet conditions
        ArrayList<String> arr = new ArrayList<>();
        
        /*
        gets index and hyphen followed by og comment
        result follows java indexing so no need to add + 1
        
        string must end in a . or !
        */
        for (int i = 0; i < allReviews.length; i++) {
            
            final String DOT = ".";
            final String EXC = "!";
            //stores temporary comment
            String temp = allReviews[i].getComment();
            
            //checks if arr contains . or !
            if (temp.contains(DOT) || temp.contains(EXC)) {
                
                //logic only occurs when string meets prerequisites
                //theres probably a better way to write this.. nesting sucks
                if (!(temp.endsWith(DOT) || temp.endsWith(EXC))) {
                    
                    temp += DOT;
                }
                
                /*
                logic here because code wont execute when if statement doesnt add
                dot or exc
                */
                arr.add(i + "-" + temp);
            }
            
        }
        
        return arr;
    }
}
