/**
 * SYST 17796 Final Project 
 * Game Class 
 * Date: 12/02/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;

public class Card {
    
   private Suit suit;
   private CardValue cardValue;
   
   public Card(CardValue cardValue, Suit suit){
       this.cardValue = cardValue;
       this.suit = suit;
   }
   
   public Suit getSuit(){
       return suit;
   }
   
   public void setSuit(Suit suit){
       this.suit = suit;
   }
   
   public CardValue getCardValue(){
       return cardValue;
   }
   
   public void setCardValue(CardValue cardValue){
       this.cardValue = cardValue;
   }
    
   public String toString(){
       return "[ "+suit+" :  "+cardValue+"";
   }
   
}
