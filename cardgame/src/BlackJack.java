

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

	private Deck deck;

	private List<Card> userCards;

	private List<Card> compHand;

	public BlackJack() {
		this.deck = new Deck();
		deck.shuffle(); // 洗牌
		this.userCards = new ArrayList<>();
		this.compHand = new ArrayList<>();

		for (int i = 0; i < 2; i++) { // 发牌两张
			drawCard(userCards);
			drawCard(compHand);
		}
		while (calculateHand(compHand) < 17) { // 系统点数小于17时
			drawCard(compHand); // 系统抽牌
		}
	}

	/**
	 * 抽牌
	 *
	 * @param cards 抽牌人的牌
	 */
	public void drawCard(List<Card> cards) {
		cards.add(deck.drawCard());
	}

	/**
	 * 计算点数
	 *
	 * @param compHand2
	 * @return
	 */
	public Integer calculateHand(List<Card> compHand2) {
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
		while (true) {
			System.out.println("你当前有" + blackJack.userCards.size() + "张牌");
			for (Card card : blackJack.userCards) {
				System.out.println("\t" + card);
			}
			System.out.println("当前点数:" + blackJack.calculateHand(blackJack.userCards));
			System.out.println("Your opponent got a " +blackJack.compHand.get(1).getName());
			if (blackJack.calculateHand(blackJack.userCards) > 21) {
				System.out.println("系统点数:"+blackJack.calculateHand(blackJack.compHand));
				if(blackJack.calculateHand(blackJack.compHand) > 21) {
					System.out.println("All Lose");
				}else {
					System.out.println("You lose");
				}
				System.out.println("restart Game? ( 'y' or  'n')");
				String input = scan.next();
				if ("y".equals(input)) {
					main(null);  //再来一次
				}
				return;
			}
			System.out.println("是否继续抽牌? ( 'y' or else)");
			String input = scan.next();
			if ("y".equals(input)) {
				blackJack.drawCard(blackJack.userCards);
			}else {
				Integer compScore = blackJack.calculateHand(blackJack.compHand);
				Integer userScore = blackJack.calculateHand(blackJack.userCards);
				System.out.println("你的点数:"+userScore);
				System.out.println("系统点数:"+compScore);
				if(userScore > compScore && userScore < 22) {
					System.out.println("You WIN");
				}else if (compScore > userScore && compScore < 22) {
					System.out.println("You Lose");
				}else {
					System.out.println("All Lose");
				}
				System.out.println("Play new Game? ('y' or else)");
				String isNew = scan.next();
				if("y".equals(isNew)) {
					main(null);
				}else {
					return;
				}
			}
		}
	}

}
