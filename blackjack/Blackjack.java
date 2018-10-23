import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;
    int a = 0;

  public Blackjack() {
    d = new Deck();
    userHand = new ArrayList<Card>;
    compHand = new ArrayList<Card>;
    for (int i = 0; i < 2; i++) {
      b.userHand.add(b.d.drawCard(i));
    }
    return userHand;
    for (int i = 0; i < 2; i++) {
      b.comHand.add(b.d.drawCard(i));
    }
    return comHandHand;

  }

  public ArrayList<String> giveHand(Deck d) {
    userHand.add(b.d.drawCard(i));




  }


  public Integer calculateHand(ArrayList<Card> userHand) {//h is could be either userhand or computerhand

    int total = 0;
    int g = 0;
    for (int i=0; i < userHand.size(); i++) {
      if (userHand.get(i).getValue() > 10) { // if king/queen/jack set value to 10
        g = 10;
      }
      else {
        g = userHand.get(i).getValue();
      }
      total1 = total1 + g;
    }
    return total1;
    }

  public Integer calculateHand(ArrayList<Card> h) {//h is could be either userhand or computerhand

    public Integer calculateHand(ArrayList<Card> h) {
  int total = 0;
  int f = 0;
  for (int i=0; i < comHand.size(); i++) {
    if (comHand.get(i).getValue() > 10) { // if king/queen/jack set value to 10
      f = 10;
    }
    else {
      f = comHand.get(i).getValue();
    }
    total2 = total2 + f;
  }
  return total2;
}


  public static void main(String[] args) {

    Blackjack b = new Blackjack();

    while (true){
    System.out.println("Your hand:");
    System.out.println("----------------------");
    System.out.println(userHand);
    System.out.println("1.Hit");
    System.out.println("2.Stay");
    System.out.println("3.Quit");

    Scanner a = new scanner(System.in);
    String b = newIn.next();

    if (b.equals("1")){
        userHand.add(b.d.drawCard(1));
      }


    if (b.equals("2")){
      break;
    }
  }

  if (b.equals("2")){
    if ()

  }

    }

  /*  b.d.reset();
    b.d.shuffle();
    System.out.println("")
    for (int i = 0; i < 2; i++) {
      b.userHand.add(b.d.drawCard(i));
    }
    return userHand;
    for (int i = 0; i < 2; i++) {
      b.comHand.add(b.d.drawCard(i));
    }
    return comHandHand;
    System.out.println(getValue)*/


//one while loop for the user, and after it break the first while loop, the second while loop for dealer's hand starts



  }

}
