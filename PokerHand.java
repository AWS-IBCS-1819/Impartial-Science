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
    return d;
  }

  public static void main(String[] args) {
    Deck d = new Deck();

    Random r = new Random(); //<-- this is to create a new object; constructor method
    int[] ar = r.ints(6300, 0, 52).distinct().toArray();//can't just print array
    for (int i = 0; i < ar.length; i ++){//loop is to help print contents of array
      //System.out.println(ar[i]);
      System.out.println(d.cards.get(ar[i]));
    }
    //System.out.println("\n" + ar.length);

    //System.out.println(d.cards);
  }
}
