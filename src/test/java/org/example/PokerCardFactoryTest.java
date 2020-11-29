package org.example;

import org.example.Model.*;
import org.example.Service.PokerCardFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PokerCardFactoryTest {
    @Test
    public void shouldCreateAKing(){
        System.out.println("create a card with input KD");
        PokerCard result = PokerCardFactory.getPokerCard("KD");
        assertTrue( (result instanceof King) && (result.getSuite()==Suite.DIAMOND));
    }
    @Test
    public void shouldCreateAnAce(){
        System.out.println("create a card with input AH");
        PokerCard result = PokerCardFactory.getPokerCard("AH");
        assertTrue( result instanceof Ace);
    }
    @Test
    public void shouldCreateAQueen(){
        System.out.println("create a card with input QH");
        PokerCard result = PokerCardFactory.getPokerCard("QH");
        assertTrue( result instanceof Queen);
    }
    @Test
    public void shouldCreateAJack(){
        System.out.println("create a card with input JC");
        PokerCard result = PokerCardFactory.getPokerCard("JC");
        assertTrue( result instanceof Jack);
    }
    @Test
    public void shouldCreateAJoker(){
        System.out.println("create a card with input J");
        PokerCard result = PokerCardFactory.getPokerCard("J");
        assertTrue( result instanceof Joker);
    }
    @Test
    public void shouldCreateATwo(){
        System.out.println("create a card with input 2H");
        PokerCard result = PokerCardFactory.getPokerCard("2H");
        assertTrue( (result.getValue()==2)&&(result.getSuite()==Suite.HEART) );
    }
    @Test
    public void shouldCreateAThree(){
        System.out.println("create a card with input 3H");
        PokerCard result = PokerCardFactory.getPokerCard("3H");
        assertTrue( (result.getValue()==3) );
    }
    @Test
    public void shouldCreateATen(){
        System.out.println("create a card with input 10H");
        PokerCard result = PokerCardFactory.getPokerCard("10H");
        assertTrue( (result.getValue()==10) && (result.getSuite()==Suite.HEART));
    }
}
