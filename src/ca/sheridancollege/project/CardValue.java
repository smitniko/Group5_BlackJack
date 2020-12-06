/**
 * SYST 17796 Final Project 
 * Game Class 
 * Date: 12/02/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;

public enum CardValue {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);
  
  private final int cardValue;
  
  private CardValue(int value){
      this.cardValue = value;
  }
  
  private int getCardValue(){
      return cardValue;
  }
}
