/**
 * SYST 17796 Final Project 
 * Game Class 
 * Date: 12/02/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;

public class Player {

    private String name; //the unique name for this player
    private int score; // personal score of the player
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public void play(){
        
    }
    
    /**
     * Chooses a card from the deck of cards
     */
    public void hit(){
        // TODO: Add a Deck object as a parameter
        // TODO: Randomly select a card from Deck
        // TODO: Increment score by value of card
        this.score += (int)(Math.random()*11)+1;
    }
    
    

}
