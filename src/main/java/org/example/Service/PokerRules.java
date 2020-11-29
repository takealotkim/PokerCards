package org.example.Service;

import org.example.Model.Joker;
import org.example.Model.PokerCard;
import org.example.Model.PokerHand;

import java.util.List;

public class PokerRules {

    public static String rankHand(PokerHand hand){
        hand.sort();
        List<PokerCard> list= hand.getCards();
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
            return "Three of a Kind";
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
        List<PokerCard> list= hand.getCards();
        int count=1;
        for(int i=1;i<list.size();i++) {
            if(list.get(i).getValue() == list.get(i-1).getValue()) {
                count++;
                if(count==4) return true;
            }else{
                count=1;
            }
        }
        return  false;
    }
    //3. Full house
    public static boolean isFullHouse(PokerHand hand){
        // two cards are same value and three remaining cards are equal value:
        List<PokerCard> list= hand.getCards();
        if(list.size()<5) return false;
        int count1=0;// count pairs
        int count=1;
        for(int i=1;i<5;i++){
            if(list.get(i).getValue()==list.get(i-1).getValue()){
                count+=1;
            }else{
                count1=count;
                count=1;
            }
        }
        return ((count==2)&&(count1==3)) || ((count==3)&&(count1==2));
    }
    //4. Flush**
    public static boolean isFlush(PokerHand hand) {
        List<PokerCard> list= hand.getCards();
        if(list.size()<5) return false;
        for(int i=1;i<list.size();i++) {
            if (list.get(i).getSuite() != list.get(i-1).getSuite())
                return false;
        }
        return true;
    }
    //5. Straight**
    public static boolean isStraight(PokerHand hand) {
        List<PokerCard> list= hand.getCards();
        if(list.size()<5) return false;
        for(int i=1;i<5;i++){
            if(list.get(i).getValue()!=list.get(i-1).getValue()+1)
                return false;
        }
        return true;
    }

    // 6. Three of a kind
    public static boolean isThreeOfAKind(PokerHand hand) {
        List<PokerCard> list= hand.getCards();
        if(list.size()<3) return false;
        int count=1;
        for(int i=1;i<list.size();i++) {
            if(list.get(i).getValue() == list.get(i-1).getValue()) {
                count++;
                if(count==3) return true;
            }else{
                count=1;
            }
        }
        return  false;
    }
    // 7. Two pair
    public static boolean isTwoPair(PokerHand hand) {
        List<PokerCard> list= hand.getCards();
        if(list.size()<4) return false;
        int count=0;// count pairs
        for(int i=1;i<list.size();i++){
            if(list.get(i).getValue()==list.get(i-1).getValue()){
                count++;
                i++; // don't compare this card again
            }
        }
        return (count==2);
    }
    // 8. One pair
    public static boolean isOnePair(PokerHand hand) {
        List<PokerCard> list= hand.getCards();
        if(list.size()<2) return false;
        for(int i=1;i<list.size();i++) {
            if(list.get(i).getValue() == list.get(i-1).getValue())
                return true;
        }
        return  false;
    }
    // 9. High Card
    public static PokerCard HighCard(PokerHand hand){
        return hand.highestRankCard();
    }
}
