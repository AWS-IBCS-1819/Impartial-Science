//Vivian Yip
//9.10

import java.util.*;

public class AboutMe{

  public static String name;
  public static String hairColor;
  public static Integer age;
  public static String location;
  public static String vacation;
  public static String height;
  public static String day;
  public static String sport;

  public AboutMe(){
    name = "Kaitlin";
    hairColor = "Black";
    age = 16;
    location = "Tacoma";
    vacation = "she doesn't know where she is traveling yet";
    height = "5'5";
    day = "Friday";
    sport = "tennis"
  }

  public static void main(String[] args) {

    AboutMe K = new AboutMe();
    System.out.println("Hi, I'm " +K.name);

    System.out.println("what do you know about Kaitlin");
    System.out.println("");
    System.out.println("only type the letter or number before the dot");
    System.out.println("");
    System.out.println("1.Name");
    System.out.println("2.Location");
    System.out.println("3.Favorite day in a week");
    System.out.println("4.Hair color");
    System.out.println("5.Breakfast");
    System.out.println("5.Height");
    System.out.println("6.Age");
    System.out.println("7.Sport");

    Scanner newIn = new Scanner(System.in);
    String userIn = newIn.next();


    if (userIn.equals("1")){
      System.out.println("Her name is " +K.name);
    }

    else if (userIn.equals("2")){
      System.out.println("a.Normally");
      System.out.println("b.During vacation");
    }

    else if (userIn.equals("3")){
      System.out.println("");
      System.out.println("");
    }

    Scanner aorb = new Scanner(System.in);
    String ab = newIn.next();
    if (ab.equals("a")){
      System.out.println("She's in " +K.location);
      System.out.println("Do you want to change her location");
      System.out.println("c.yes");
      System.out.println("d.no");
    }

    else if (ab.equals("b")){
      System.out.println(K.vacation);
    }


    Scanner cord = new Scanner(System.in);
    String cd = newIn.next();
    if (cd.equals("c")){
      System.out.println("Please enter the location");
      Scanner changeL = new Scanner(System.in);
      String newL = changeL.next();
      System.out.println("Got it, she is at " +newL+ " now");
    }



  }
}
