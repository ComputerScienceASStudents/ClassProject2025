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

    private Level levelOne = new Level(); //has a level
    private Level levelTwo = new Level();
    private Level levelThree = new Level();
    
    public Game() {
        
    }
    
    /**
     * not told waht to put in part a.. will leave this for test cases
     * for chart below part a
     * 
     * @return 
     */
    public boolean isBonus() {
//        boolean bonusCheck = false;
//        
//        if(bonusCheck) {
//            return true;
//        }
//        return false;

        return true;
    }
    
    public void play() {
        levelOne.setPoints(200);
        levelTwo.setPoints(100);
        levelThree.setPoints(500);
    }
    
    /**
     * part a of frq
     * gets score of all 3 games and checks if bonus ( *= 3 )
     * 
     * @return 
     */
    public int getScore() {
        int gameScore = 0;
        
        if (levelOne.goalReached()) {
            gameScore += levelOne.getPoints();
            
            if (levelTwo.goalReached()) {
            gameScore += levelTwo.getPoints();
            
                if (levelThree.goalReached()) {
                gameScore += levelThree.getPoints();
                }
            }
        }
        
        if(isBonus()) gameScore *= 3;
        
        return gameScore;
    }
    
    /**
     * part b of FRQ
     * 
     * simulates the "num" of games played and gets highest score
     * 
     * "play of game" is simulated by calling helper method (play();)
     * play() is followed by calls to getScore(), each call of latter method
     * returns score earned
     * 
     * assume getScore works as intended (insulting my code) 
     * 
     * 
     * MUST CALL PLAY() AND GETSCORE() APPROPRIATELY
     * 
     * 
     * @param num how many times user played
     * @return highest game score earned
     */
    public int playManyTimes(int num) {
        int maxScore = 0;
        
        //for loop to simulate the number of plays user wants
        for (int i = 0; i < num; i++) {
            
            //simulate play
            play();
            
            //if statement to check if maxScore is highest
            if (getScore() > maxScore) {
                maxScore = getScore();
            }
        }
        
        return maxScore;
    }
}
