package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Nikolas Smith
 * @author Semaj Primm 
 */
public class Hand {
    
    private ArrayList<Card> hand;
    private int value;
    
    public Hand(){
        
        
    }
    
    public void addCard(Card card){
        this.hand.add(card);
    }
    
    public void clear(){
        this.hand.clear();
    }
    
    public int getHandAmount(){
        return this.value;
    }
    
    public Card getCard(int index){
        return this.hand.get(index);
    }
    
    public boolean checkCharlie(){
        return false;
    }
    
    
    
}
