package org.example;

import org.example.Model.PokerCard;
import org.example.Model.Suite;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PokerCardTest {
    @Test
    public void compareTwoCardsShouldBETrue() {
        System.out.println("compare 1diamond with 1diamond");
        PokerCard one= new PokerCard(Suite.DIAMOND, 1);
        PokerCard two= new PokerCard(Suite.DIAMOND, 1);
        assertTrue( one.equals(two));
    }
    @Test
    public void compareDifferentCardsShouldBeFalse() {
        System.out.println("compare 1heart with 1diamond");
        PokerCard one= new PokerCard(Suite.HEART, 1);
        PokerCard two= new PokerCard(Suite.DIAMOND, 1);
        assertFalse( one.equals(two));
    }
    @Test
    public void compareCardsShouldBEFalse() {
        System.out.println("compare 2heart with 1diamond");
        PokerCard one= new PokerCard(Suite.HEART, 2);
        PokerCard two= new PokerCard(Suite.HEART, 1);
        assertFalse( one.equals(two));
    }
    @Test
    public void compareCardsShouldBeLessThan(){
        System.out.println("compare 1heart with 2diamond");
        PokerCard one= new PokerCard(Suite.HEART, 1);
        PokerCard two= new PokerCard(Suite.DIAMOND, 2);
        assertTrue( one.compareTo(two) == -1);

    }
}
