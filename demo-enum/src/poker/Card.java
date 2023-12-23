package poker;

public class Card {
    private Rank rank;
    private Suit suit;

    private Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public static Card setCard(Suit suit, Rank rank) {
        return new Card(suit,rank);
    }

    @Override
    public String toString() {
        return this.suit.getVal() + " " + this.rank.getVal();
    }
}
