

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	List<Card> cards;// a bunch of card object (main deck)
	List<Card> discard;// what is given out

	public Card drawCard() {
		Card c = cards.get(0);// get a card
		cards.remove(0);// remove the card form the deck that's given out
		discard.add(c);// so the card given out is added to the discard list
		return c;// return a card object

	}

	public void reset() {// starting over
		cards.addAll(discard);// put all the cards in discard list back into the main deck
		discard.clear();// clear the discard list
	}

	public void shuffle() {
		Random r = new Random();
		ArrayList<Card> shuffled = new ArrayList<Card>();

		int[] ar = r.ints(5200, 0, 52).distinct().toArray();// creat a int array with all the distinct int between 0 and
															// 51
		for (int i = 0; i < 52; i++) {
			shuffled.add(cards.get(ar[i]));
		}
		cards = shuffled;
	}

	public Deck() {
		cards = new ArrayList<Card>();
		discard = new ArrayList<Card>();

		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 4; j++) {
				String num;
				String suit;
				if (i == 11) {
					num = "Jack";
				} else if (i == 12) {
					num = "Queen";
				} else if (i == 13) {
					num = "King";
				} else if (i == 1) {
					num = "Ace";
				} else {
					num = Integer.toString(i);
				}
				if (j == 1) {
					suit = "Diamonds";
				} else if (j == 2) {
					suit = "Clubs";
				} else if (j == 3) {
					suit = "Hearts";
				} else {
					suit = "Spades";
				}
				Card c = new Card();// each time you draw a card from random shuffle, you have to name it and put it
									// in the main deck
				c.setName(num + " of " + suit);
				c.setValue(i);
				cards.add(c);// added to the main deck
			}
		}
	}
	
}
