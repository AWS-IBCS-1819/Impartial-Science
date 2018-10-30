

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

	private Deck deck; // create a deck

	private List<Card> userCards; // card given to the user

	private List<Card> compHand; // card given to the computer

	public BlackJack() {
		this.deck = new Deck();
		deck.shuffle(); // shuffle the card
		this.userCards = new ArrayList<>(); // creating user's card deck
		this.compHand = new ArrayList<>(); // creating computer's card deck

		for (int i = 0; i < 2; i++) { // give two cards
			drawCard(userCards); // to the user
			drawCard(compHand); // to the computer
		}
		while (calculateHand(compHand) < 17) { // the the computer's point is less than 17
			drawCard(compHand); // give another card to the computer
		}
	}

	/**
	 * draw card
	 *
	 * @param cards user's card
	 */
	public void drawCard(List<Card> cards) { draw card method
		cards.add(deck.drawCard()); // the drawed card is added to the deck of used cards
	}

	/**
	 * calculate the points
	 *
	 * @param compHand2
	 * @return
	 */
	public Integer calculateHand(List<Card> compHand2) { //method of culculating the points
		Integer total = 0;
		for (Card card : compHand2) {
			total += card.getValue();
		}
		return total; 

	}

	public static void main(String[] args) {
		System.out.println("---new Game---");
		System.out.println("---BlackJack---");
		Scanner scan = new Scanner(System.in);
		BlackJack blackJack = new BlackJack();
		while (true) { //while loop
			System.out.println("You have " + blackJack.userCards.size() + " cards"); //print out cards
			for (Card card : blackJack.userCards) {
				System.out.println("\t" + card); // the two cards
			}
			System.out.println("Your point:" + blackJack.calculateHand(blackJack.userCards)); //print out user's point
			System.out.println("Your opponent got a " +blackJack.compHand.get(1).getName()); // print out one of the comp's card
			if (blackJack.calculateHand(blackJack.userCards) > 21) { //calculate if user bust
				System.out.println("Computer's point:"+blackJack.calculateHand(blackJack.compHand)); // calculate if comp bust
				if(blackJack.calculateHand(blackJack.compHand) > 21) { // if all larger than 21
					System.out.println("All Lose");
				}else {
					System.out.println("You lose");
				}
				System.out.println("restart Game? ( 'y' or  'n')");
				String input = scan.next();
				if ("y".equals(input)) {
					main(null);  // play it again
				}
				return; // quit
			}
			System.out.println("Do you want to draw another card? ( 'y' or else)");
			String input = scan.next();
			if ("y".equals(input)) {
				blackJack.drawCard(blackJack.userCards); // draw another card
			}else {
				Integer compScore = blackJack.calculateHand(blackJack.compHand); //calculate the total points
				Integer userScore = blackJack.calculateHand(blackJack.userCards); // calculate the total points
				System.out.println("Your point:"+userScore);
				System.out.println("Computer's point:"+compScore);
				if(userScore > compScore && userScore < 22) { // if user's point is larger than comp's and smaller than 22
					System.out.println("You WIN");
				}else if (compScore > userScore && compScore < 22) { // if comp's point is larger than user's and smaller than 22
					System.out.println("You Lose");
				}else {
					System.out.println("All Lose"); // else all lose
				}
				System.out.println("Play new Game? ('y' or else)");
				String isNew = scan.next();
				if("y".equals(isNew)) {
					main(null);//new game
				}else {
					return; // quit
				}
			}
		}
	}

}
