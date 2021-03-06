package org.example.Service;

import org.example.Model.*;

import java.util.HashMap;
import java.util.Map;

public class PokerCardFactory {
    private static Map<Character, Suite> map = new HashMap<Character, Suite>();
    static {
        map.put('D', Suite.DIAMOND);
        map.put('H', Suite.HEART);
        map.put('S', Suite.SPADE);
        map.put('C', Suite.CLUB);
        map.put('d', Suite.DIAMOND);
        map.put('h', Suite.HEART);
        map.put('s', Suite.SPADE);
        map.put('c', Suite.CLUB);
    }

    public static PokerCard getPokerCard(String name){

        if(name == null)
            return null;
        if(name.length()==0)
            return null;
        if(name.length()==1) {
            if(name.equalsIgnoreCase("j") || name.equalsIgnoreCase("joker"))
                return new Joker();
            return null;
        }
        char ch = name.charAt(name.length()-1);
        Suite suite = map.get(new Character(ch));
        String value = name.substring(0,name.length()-1);
        if(value.equalsIgnoreCase("a")) {
            return new PokerCard(suite, 13);//new Ace(suite);
        }
        if(value.equalsIgnoreCase("k")) {
            return new King(suite);
        }
        if(value.equalsIgnoreCase("q")) {
            return new Queen(suite);
        }
        if(value.equalsIgnoreCase("j")) {
            return new Jack(suite);
        }
        int intValue = Integer.parseInt(value);
        if((intValue<=10) && (intValue>=2)){
            return new PokerCard(suite, intValue);
        }
        return null;
    }
}
