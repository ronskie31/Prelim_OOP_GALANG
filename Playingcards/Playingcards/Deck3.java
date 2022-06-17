package Playingcards;

public class Deck3 {
	private static Card3[] cards = new Card3[52];

	// Creating a deck of cards.
	public Deck3() {
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards[i++] = new Card3(rank, suit);
			}
		}
	}

	// Printing the cards in the deck.
	public static void printCards() {
		for (Card3 cardss : cards) {
			System.out.println(cardss.toString());
		}
	}
}