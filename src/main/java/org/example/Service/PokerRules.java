package org.example.service;

import org.example.Model.Joker;
import org.example.Model.PokerCard;
import org.example.Model.PokerHand;
import org.example.Model.Suite;

import java.util.List;

public class PokerRules {

    public static String rankHand(PokerHand hand){
        hand.sort();
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
        List<PokerCard> list= hand.getCards();
        if(list.contains(new Joker())) {
            PokerCard temp = list.get(0);
            for (PokerCard card : list) {
                System.out.println("FOUND " + card.getSuite() + card.toString());
                if((card.compareTo(temp)!=0) && !card.equals(new Joker())){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    //1. Straight flush*
    public static boolean isStraightFlush(PokerHand hand){
        List<PokerCard> list= hand.getCards();
        if(list.size()<5)
            return false;
        // check cards are all the same suite:
        for(int i=1;i<5;i++){
            if(list.get(i).getSuite()!=list.get(i-1).getSuite())
                return false;
            if(list.get(i).getValue()!=list.get(i-1).getValue()+1)
                return false;
        }
        return true;
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
