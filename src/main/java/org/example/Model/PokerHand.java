package org.example.Model;
import java.util.*;

public class PokerHand {

    private List<PokerCard> cards=new ArrayList<PokerCard>(5);
    private Object CardComparator;

    public void add(PokerCard card){
        cards.add(card);
    }

    public PokerCard highestRankCard() {
        return cards.get(0);
    }

    public PokerCard getCard(int n){
        return cards.get(n);
    }

    public void sort(){
        Collections.sort(cards);
    }

    public List<PokerCard> getCards(){
        return cards;
    }

    public int count(){
        return cards.size();
    }
}