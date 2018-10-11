import java.util.*;
public class PokerHand{

/*
Deck is an ArrayList of cards (strings)
52 strings
index values 0-51
inser a card @ specific index
  Goal: create a random index
*/
  public Deck shuffle(Deck d){

    Random r = new Random(); //<-- this is to create a new object; constructor method
    ArrayList<String> shuffled = new ArrayList<String>();

    int[] ar = r.ints(6300, 0, 52).distinct().toArray();//can't just print array
    for (int i = 0; i < 52; i ++){//loop is to help print contents of array
      shuffled.add(d.cards.get(ar[i]));
  }
  d.cards = shuffled;
  return d;

  public static void main(String[] args) {
    Deck d = new Deck();

    }

  }
}
