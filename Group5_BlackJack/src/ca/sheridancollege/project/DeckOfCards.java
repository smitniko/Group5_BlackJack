/**
 * SYST 17796 Final Project 
 * Game Class 
 * Date: 12/07/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;
    
    
    /**
     * This is a 1 argument constructor that passes in a collection
     * of Card objects
     * @param deck
     */
    public DeckOfCards(ArrayList<Card> deck){
        this.deck = deck;
    }
    
    /**
     * This is a zero argument constructor that will build a full
     * Deck of Cards
     */
    public DeckOfCards(){
        List<String> suits = Card.getValidSuits(); //this is calling a static method
                                                    //so we do NOT need an instance of Card
                                                    //to call it
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames)
                deck.add(new Card(faceName,suit));
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    public void setDeck(ArrayList<Card> deck){
        this.deck = deck;
    }
    
    /**
     * This method will "deal" the top card off the deck
     */
    public Card dealTopCard(){
        if(deck.size() > 0){
            return deck.remove(0);
        }else{
            return null;
        }
    }
    
    /**
     * This method will shuffle the deck of cards 
     */
    public void shuffle(){
        Collections.shuffle(deck);
        
        // display
        System.out.println("Items in deck: " + deck);
    }
    

}


