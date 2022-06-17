package Playingcards;

public class Card3 {

    // Declaring the variables rank and suit.
    private final Rank rank;
    private final Suit suit;

    // A constructor that takes two parameters, rank and suit.
    public Card3(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // This function returns the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // This function returns the rank of the card
    public Rank getRank() {
        return rank;
    }

    // the toString() method returns a string representation of the object
    public String toString() {
        return rank + " of " + suit;
    }

}
