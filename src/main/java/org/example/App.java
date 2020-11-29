package org.example;

import org.example.Model.PokerCard;
import org.example.Model.PokerHand;
import org.example.Service.PokerCardFactory;
import org.example.Service.PokerRules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        while(true) {

            System.out.println("to exit enter CTRL + C");
            System.out.println("please enter list of poker cards in the form: JS,10S,9S,8S,7S");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            //String input = "JS,10S,9S,8S,7S";
            // TODO: validate and error checking for input
            String result = calculatePokerHand(input.trim());
            System.out.println(result);
        }
    }

    protected static String calculatePokerHand(String input){
        // parse input string
        String[] parts = input.trim().split(",");
        // create a pokerhand
        PokerHand pokerHand = new PokerHand();
        for (String s : parts) {
            PokerCard card = PokerCardFactory.getPokerCard(s);
            pokerHand.add(card);
            pokerHand.sort();
        }
        // evaluate the hand ranking:
        String result = PokerRules.rankHand(pokerHand);
        System.out.println("Result is: " + result);
        return result;
    }
}
