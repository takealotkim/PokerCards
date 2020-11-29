package org.example.Model;

public class Joker extends PokerCard {

    public Joker(){
        super(null, 100);
    }

    @Override
    public String toString(){
        return Integer.toString(this.value);
    }

}
