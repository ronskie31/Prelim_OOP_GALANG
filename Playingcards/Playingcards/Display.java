package Playingcards;

public class Display {

	public static void main(String[] args) {

		Deck deck = new Deck();

		// Printing out the cards in the deck.
		for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
			for (int rank = Card.ACE; rank <= Card.KING; rank++) {
				Card card = deck.getCard(suit, rank);
				System.out.format("%s of %s%n", Card.rankToString(card.getRank()), Card.suitToString(card.getSuit()));
			}
		}
	}

}