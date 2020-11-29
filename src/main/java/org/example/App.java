package org.example;

import org.example.Model.PokerHand;

/**
 * read input from console,
 * create a poker hand
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // read input from console
        String input = "AS,10C,10H,3 D,3S";
        String result = calculatePokerHand(input);
        System.out.println(result);
    }

    protected static String calculatePokerHand(String input){
        // parse input string
        String[] parts = input.trim().split(",");
        // create a pokerhand
        PokerHand pokerHand = new PokerHand();
        for (String s : parts)
        {
            // Do something
        }
        // evaluate the hand:
        String result = PokerRules.rankHand(pokerHand);
        return "High Card";
    }
}
