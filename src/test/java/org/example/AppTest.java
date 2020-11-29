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
    public void shouldReturnFiveOfAKind() {
        String input = "AS,AC,AH,AD,J";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Five of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnFiveOfAKind() {
        String input = "8H,8C,8D,J,8S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Five of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnStraightFlush() {
        String input = "JS,10S,9S,8S,7S";;
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight Flush";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldALsoReturnStraightFlush() {
        String input = "10C,9C,8C,7C,6C";;;
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight Flush";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnTwoPair() {
        String input = "AS,10C,10H,3D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Two Pair";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnTwoPair() {
        String input = "KS,4C,4H,KD,2S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Two Pair";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnOnePair() {
        String input = "AS,10C,10H,8D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "One Pair";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnOnePair() {
        String input = "QS,5C,7H,9D,QD";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "One Pair";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnHighCard() {
        String input = "AS,10C,2H,8D,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "High Card";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnFourOfAKind() {
        String input = "5C,5D,5H,5S,2D";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Four of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
}
    @Test
    public void shouldAlsoReturnFourOfAKind() {
        String input = "8C,2S,2H,2C,2D";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Four of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }

    @Test
    public void shouldReturnFullHouse() {
        String input = "6S,6H,6D,KC,KH";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Full House";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnFullHouse() {
        String input = "2S,JH,JD,2C,JS";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Full House";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnFlush() {
        String input = "JD,9D,8D,4D,3D";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Flush";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnFlush() {
        String input = "AH,3H,5H,8H,QH";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Flush";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnStraight() {
        String input = "10D,9C,8H,7D,6C";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnStraight() {
        String input = "JS,8C,QD,9H,10C";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Straight";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldReturnThreeOfAKind() {
        String input = "3C,3S,3H,9H,2S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Three of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
    @Test
    public void shouldAlsoReturnThreeOfAKind() {
        String input = "3C,2D,3H,9H,3S";
        String output = App.calculatePokerHand(input);
        String expectedOutput = "Three of a Kind";
        System.out.println(input + ": " + output);
        assertTrue(output.equalsIgnoreCase(expectedOutput));
    }
}
