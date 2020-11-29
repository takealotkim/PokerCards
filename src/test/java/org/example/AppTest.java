package org.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    @Test
    public void shouldReturnTwoPair() {
        String input = "AS,10C,10H,3D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Two Pair";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnOnePair() {
        String input = "AS,10C,10H,8D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "One Pair";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnHighCard() {
        String input = "AS,10C,2H,8D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "High Card";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnFiveOfAKind() {
        String input = "AS,AC,AH,AD,J";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Five of a Kind";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnStraightFlush() {
        String input = "JC,10C,9C,8C,7C";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight Flush";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnFourOfAKind() {
        String input = "5C,5D,5H,5S,2D";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Four of a Kind";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnFullHouse() {
        String input = "6S,6H,6D,KC,KH";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Full House";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnFlush() {
        String input = "JD,9D,8D,4D,3D";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Flush";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnStraight() {
        String input = "10D,9C,8H,7D,6C";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight";
        assertTrue(output == expectedOutput);
    }
    @Test
    public void shouldReturnThreeOfAKind() {
        String input = "QC,QS,QH,9H,2S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight";
        assertTrue(output == expectedOutput);
    }
}
