package org.example.Service;

import org.example.Model.PokerCard;
import org.example.Model.PokerHand;

public class PokerRules {

    public static String rankHand(PokerHand hand){
        //0. Five of a kind*
        if(isFiveOfaKind(hand))
            return "Five Of a Kind";
        //1. Straight flush*
        if(isStraightFlush(hand))
            return "Straight Flush";
        //2. Four of a kind
        if(isFourOfAKind(hand))
            return "Four of a Kind";
        //3. Full house
        if(isFullHouse(hand))
            return "Full House";
        //4. Flush**
        if(isFlush(hand))
            return "Flush";
        //5. Straight**
        if(isStraight(hand))
            return "Straight";
        // 6. Three of a kind
        if(isThreeOfAKind(hand))
            return "Three of a kind";
        // 7. Two pair
        if(isTwoPair(hand))
            return "Two Pair";
        // 8. One pair
        if(isOnePair(hand))
            return "One Pair";
        // 9. High card
        return "High Card";
    }

    //0. Five of a kind*
    public static boolean isFiveOfaKind(PokerHand hand){
        return false;
    }
    //1. Straight flush*
    public static boolean isStraightFlush(PokerHand hand){
        return false;
    }
    //2. Four of a kind
    public static boolean isFourOfAKind(PokerHand hand){
        return false;
    }
    //3. Full house
    public static boolean isFullHouse(PokerHand hand){
        return false;
    }
    //4. Flush**
    public static boolean isFlush(PokerHand hand) {
        return  false;
    }
    //5. Straight**
    public static boolean isStraight(PokerHand hand) {
        return  false;
    }

    // 6. Three of a kind
    public static boolean isThreeOfAKind(PokerHand hand) {
        return  false;
    }

    // 7. Two pair
    public static boolean isTwoPair(PokerHand hand) {
        return  false;
    }

    // 8. One pair
    public static boolean isOnePair(PokerHand hand) {
        return  false;
    }
    // 9. High Card
    public static PokerCard HighCard(PokerHand hand){
        return hand.highestRankCard();
    }
}
