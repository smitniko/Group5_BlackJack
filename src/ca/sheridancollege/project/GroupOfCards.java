/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * Date: 10/14/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 * @author Dominique Rodney
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards extends Card{

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private ArrayList<Card> trash;
    private Card Card;
    
    
    Card c;
    
    
    public GroupOfCards(){
        this.c = Card;
//        this.c = new Card(rank, suit, value) {};
       
    }
    
    public void generateGroupofCards(){
    
    }
    
    public ArrayList<Card> getGroupofCards() {
        return cards;
    }
    
    public void shuffle(){
    
    }
    
    public Card pickCard(){
       return Card;
    }
    
    public Card getCard(int index){
        
        return Card;
    }
    
    public String toString(){
        return "[Deck: " + cards + " ]";
    }  
}
