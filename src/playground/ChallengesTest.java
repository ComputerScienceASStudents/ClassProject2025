/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground;

import playground.practiceClasses.qs2q1.Level;

/**
 *
 * @author franz
 */
public class ChallengesTest {
    
    //global var
    
    
    //unit 6 FRQ vars
    int itemsSold[] = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    double wages[] = new double[itemsSold.length];
    
    

    public ChallengesTest() {
        ///////////////////////////////////////////////////////////////////
        //ex1 climbing the staircase n amount of times
        
        
        int n = 5; //input
        
        //for loop that makes a staircase that stars from right to left
        //top to bottom
        
        //output should be 2
//        for (int i = 0; i < n; i++) {
//            //as i increases... j slowly builds up to i
//            for (int j = 0; j <= i; j++) { //so j would never exceed i
//                
//                System.out.print("*"); //using print without new line
//            }
//            System.out.println("");
//        }
        
        //staircase flipped on the x axis
        
        //output should be 2
//        for (int i = 0; i < n; i++) {
//            //as i increases... j slowly builds down to i
//            for (int j = n - 1; j >= i; j--) { //so j would never go below i
//                
//                System.out.print("*"); //using print without new line
//            }
//            System.out.println("");
//        }

        //question set 2 q1
        Level l = new Level();

        //unit 6 FRQ - Progress check
        payRoll();
        
        
    }

    /**
     * unit 6 FRQ - Progress check
     * 
     */
    private void payRoll() {
        double f = 10.0;
        double p = 1.5;
        
        computeWages(f, p);
        
        displayAr(itemsSold, "from itemsSold array...");
        displayAr(wages, "from wages array...");
        
    }

    /**
     * method called in frq unit 6
     * @return 
     */
    private double computeBonusThreshold() {
        
        int calc = 0;
        
        int min = itemsSold[0];
        int max = 0;
        
        //for every element in the array
        for(int x : itemsSold) {
            
            if (x < min) {
                min = x;
            }
            
            if (x > max) {
                max = x;
            }
            calc += x;
            
        }
        
        
        
        //(calc - min - max)
        double y = ((calc) - min - max); //using any calculation when initializing
                                         //var cant return an actual yes
                                         //i think its because of calculations
                                         //read in int
        return y / 8; //returning takes priority strings or int
        
    }

    private void computeWages(double fixedWage, double perItemWage) {

        //wages have same length as itemsSold
        //wages array has the same length as itemsSold


        //If the employee sold more items than the bonus threshold,
        //the employee also receives a percent bonus added to their wages.

        //for every index in wages....
        for(int x = 0; x < wages.length; x++) {

            //vars
            double newWage = 0;
            double newBonus = computeBonusThreshold();

            //calculate wage (before bonus)
            newWage = fixedWage + (perItemWage * itemsSold[x]);

            //if itemsSold by employee is greater than bonus threshold...
            if(itemsSold[x] > newBonus) {

                //adds a 10 percent bonus (from what they earned it looks like?)
                newWage *= 1.1;
            }

            wages[x] = newWage; //assign it after calculations

        }
    }

    /**
     * displays int array with message
     * 
     * @param array array
     * @param y optional string with yes
     */
    private void displayAr(int[] array, String y) {
        System.out.println(y);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " from " + i);
        }
        
        System.out.println("");
    }

    /**
     * displays double array with message
     * 
     * @param array array
     * @param y optional string with yes
     */
    private void displayAr(double[] array, String y) {
        System.out.println(y);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " from " + i);
        }
        
        System.out.println("");
    }
}
