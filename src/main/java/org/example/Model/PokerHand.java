package org.example.Model;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class PokerHand {

    private List<PokerCard> cards=new ArrayList<PokerCard>();

    public void add(PokerCard card){
        cards.add(card);
    }

    public void sort(){

    }
    public PokerCard getCardAt(int index){
        return cards.get(index);
    }
    public PokerCard highestRankCard() {
        return cards.get(0);
    }
}
