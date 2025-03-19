/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package playground.practiceClasses.qs2q1;

/**
 *
 * @author franz
 */
public class Game {

    private Level levelOne; //has a level
    private Level levelTwo;
    private Level levelThree;
    
    public Game() {
        
    }
    
    public boolean isBonus() {
        boolean bonusCheck = false;
        
        if(bonusCheck) {
            return true;
        }
        return false;
    }
    
    public void play() {
        
    }
    
    public int getScore() {
        int gameScore = 0;
        
//        if (levelOne.goalReached()) {
//            gameScore += levelOne.getPoints();
//            
//            if (levelTwo.goalReached()) {
//            gameScore += levelTwo.getPoints();
//            
//                if (levelThree.goalReached()) {
//                gameScore += levelThree.getPoints();
//                }
//            }
//        }
        if(!(levelOne.goalReached())) {
            
            
            
        }
        if(isBonus()) {
            gameScore *= 3;
        }
        
        return gameScore;
    }
    
    public int playManyTimes(int num) {
        
    }
}
