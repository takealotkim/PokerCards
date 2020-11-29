package org.example.Model;

public class PokerCard implements Comparable<PokerCard> {
    final protected Suite suite;
    final protected int value;

    public PokerCard(Suite suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public Suite getSuite() { return suite; }

    // we will sort cards by their value only
    @Override
    public int compareTo(PokerCard o) {
        return new Integer(this.value).compareTo(((PokerCard) o).value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PokerCard)) {
            return false;
        }
        return ((this.value == ((PokerCard) o).value) && (this.suite == ((PokerCard) o).suite));
    }
}
