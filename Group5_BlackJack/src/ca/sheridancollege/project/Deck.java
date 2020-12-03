/**
 * SYST 17796 Final Project 
 * Game Class 
 * Date: 12/02/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private ArrayList deck;
    
    public void Deck(){  
        this.deck = new ArrayList();
        for(int i = 0; i < 13; i++){
            CardValue value = CardValue.values()[i];
            for(int j = 0; j < 4; j++){
                Card card = new Card(value, Suit.values()[j]);
                this.deck.add(card);
            }
        }
        Collections.shuffle(deck);
        Iterator cardIterator = deck.iterator();
        while(cardIterator.hasNext()){
            Card aCard = (Card) cardIterator.next();
            System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
        }
    }
}


