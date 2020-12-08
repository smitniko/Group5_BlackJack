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
import java.util.Scanner;

/**
 * The class that models our game. 
 */
public class Game {
    private String name;                //the title of the game
    private ArrayList<Player> players;  // the players of the game
    
    public static void main(String[] args) {
        // Creates game object and sets name of game
        Game game = new Game("Blackjack");
        
        // Creates player and dealer objects
        Player player = new Player("Player");
        Player dealer = new Player("Dealer");
        
        // Deck Object
//        DeckOfCards deck = new DeckOfCards();
//        deck = new DeckOfCards();
//        deck.shuffle();
        
        
        // Creates updated Deck for ShowCard
//        ShowCard Hand = new ShowCard();
//        Hand.ShowCard();
        
        //Test Card object
//        Card card1 = new Card("ace" , "spades");
//        System.out.println(card1);
        
        
        
        
        // Adds player and dealer to Game players
        game.addPlayer(player);
        game.addPlayer(dealer);
        
        // Sysyem Info New Game
        System.out.println("Welcome to " + game.getName());
        System.out.println("You are: " + player.getName() + "\t Opponent is: " + dealer.getName() + "\n");
        
        // Start playing game method
        game.play();
        
        // Declare Winner method
        game.declareWinner();
        
    }
    
    
    public Game(String name) {       
        this.name = name;
        players = new ArrayList();
    }

    /** @return the name */
    public String getName() {
        return name;
    }

    /** @return the players of this game */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /** @param players the players of this game */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    public void addPlayer(Player player){
        this.players.add(player);
    }

    /** Play the game. This might be one method or many method calls depending on your game. */
    public void play(){
        boolean gameOver = false;
        while(!gameOver){
            
            // DEALER HITS OR STANDS
            // Dealer randomly hits or stands
            //int r = (int)(Math.random()*2)+1;
            players.get(1).hit();
            System.out.println(players.get(1).getName() + " Hits \n" + players.get(1).getName() + " SCORE: " + players.get(1).getScore());
            
            // Ends game if dealer score is more than or equal to 21
            if(players.get(1).getScore() >= 21){
                gameOver = true;
            } else{
            
                // PLAYER HITS OR STANDS
                Scanner scan = new Scanner(System.in);
                System.out.println("Hit or Stand?");
                String playerHitOrStand = scan.nextLine();

                if(playerHitOrStand.equals("Hit")){
                    players.get(0).hit();
                }
                
                // Ends game if player score is more than or equal to 21
                if(players.get(0).getScore() >= 21){
                    gameOver = true;
                }
                // Prints out player score
                System.out.println("YOUR SCORE: " + players.get(0).getScore() + "\n");
            }   
        }
    }

    /** When the game is over, use this method to declare and display a winning player. */
    public void declareWinner(){
        System.out.println("\n");
        System.out.println("GAME OVER");
        
        if(players.get(1).getScore() > 21 && players.get(0).getScore() <= 21){
            System.out.println(players.get(0).getName() + " wins");
        } else if(players.get(0).getScore() > 21 && players.get(1).getScore() <= 21){
            System.out.println(players.get(1).getName() + " wins");
        } else if(players.get(0).getScore() == 21 && players.get(1).getScore() == 21){
            System.out.println("All players win");
        } else{
            System.out.println("BUST");
        }
        // Prints final score of dealer and player
        System.out.println(players.get(1).getName() + " FINAL SCORE: " + players.get(1).getScore());
        System.out.println("YOUR FINAL SCORE: " + players.get(0).getScore() + "\n");
    }
}
