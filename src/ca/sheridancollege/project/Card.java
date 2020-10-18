/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * Date: 10/14/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 * @author Dominique Rodney
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @modifier Nikolas Smith
 */
public abstract class Card {
    private String rank;
    private String suit;
    private int value;
    
    public Card(String rank, String suit, int value){
        this.rank=rank;
        this.suit=suit;
        this.value=value;
    }
    
    public void changeAce(){
    
    }
   
    public String getRank(){
        return rank;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public int getValue(){
        return value;
    }   
    
    public String toString(){
        return "[Rank: " + rank + " Suit: " + suit + " Value " + value +  "]";
        
    }
 
}
