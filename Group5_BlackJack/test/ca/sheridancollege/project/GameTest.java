/**
 * SYST 17796 Final Project 
 * GameTest Class 
 * Date: 12/06/2020
 * @author Nikolas Smith
 * @author Ryan McMahon
 * @author Semaj Primm
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Running before test case");
    }
    
    @After
    public void tearDown() {
        System.out.println("Running after test case");
    }

    /**
     * Test of getName method, validates the good path of class Game.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getNameGood");
        Game game = new Game("Blackjack");
        boolean expResult = true;
        boolean result = !game.getName().isEmpty();
        assertEquals(expResult, result);
        assertTrue(result);
    }
    
    /**
     * Test of getName method, validates the bad path of class Game.
     */
    @Test
    public void testGetNameBad() {
        System.out.println("getNameBad");
        Game game = new Game("");
        boolean expResult = false;
        boolean result = game.getName().length() > 0;
        
        assertEquals(expResult, result);
        assertFalse(result);
    }
    
    /**
     * Test of getName method, validates the Boundary path of class Game.
     */
    @Test
    public void testGetNameBoundary() {
        System.out.println("getNameBoundary");
        Game game = new Game("");
        boolean expResult = true;
        boolean result = game.getName().equals("");
        assertEquals(expResult, result);
        assertTrue(result);
    }

    /**
     * Test of getPlayers method, validates the Good path of class Game.
     */
    @Test
    public void testGetPlayersGood() {
        System.out.println("getPlayersGood");
        Game game  = new Game("Blackjack");
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));
        boolean expResult = true;
        boolean result = !game.getPlayers().isEmpty();
        assertEquals(expResult, result);
        assertTrue(result);
    }
    
    /**
     * Test of getPlayers method, validates the Bad path of class Game.
     */
    @Test
    public void testGetPlayersBad() {
        System.out.println("getPlayersBad");
        Game game  = new Game("Blackjack");
        boolean expResult = false;
        Player player = new Player("Player 1");
        boolean result = game.getPlayers().contains(player);
        assertEquals(expResult, result);
        assertFalse(result);
    }
    
    
        /**
     * Test of getPlayers method, validates the Boundary path of class Game.
     */
    @Test
    public void testGetPlayersBoundary() {
        System.out.println("getPlayersBoundary");
        Game game  = new Game("Blackjack");
        boolean expResult = true;
        boolean result = game.getPlayers().isEmpty();
        assertEquals(expResult, result);
        assertTrue(result);
    }

    /**
     * Test of addPlayer method, validate Good path of class Game.
     */
    @Test
    public void testAddPlayerGood() {
        System.out.println("addPlayerGood");
        Player dealer = new Player("Dealer");
        Game game = new Game("Blackjack");
        game.addPlayer(dealer);
        
        boolean expResult = true;
        boolean result = game.getPlayers().size() == 1;
        assertEquals(expResult, result);
        assertTrue(result);
    }
    
    
    /**
     * Test of addPlayer method, validate Bad path of class Game.
     */
    @Test
    public void testAddPlayerBad() {
        System.out.println("addPlayerBad");
        Game game = new Game("Blackjack");
        game.addPlayer(null);
        
        boolean expResult = false;
        boolean result = game.getPlayers().isEmpty();
        assertEquals(expResult, result);
        assertFalse(result);
    }
    
    
    /**
     * Test of addPlayer method, validate Boundary path of class Game.
     */
    @Test
    public void testAddPlayerBoundary() {
        System.out.println("addPlayerBoundary");
        Game game = new Game("Blackjack");
        game.addPlayer(new Player("P1"));
        
        boolean expResult = true;
        boolean result = !game.getPlayers().isEmpty();
        assertEquals(expResult, result);
        assertTrue(result);
    }
    
    
    
}
