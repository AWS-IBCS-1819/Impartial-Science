//Vivian Yip
//9.10

import java.util.*;

public class AboutMe{

  public static String name;
  public static String hairColor;
  public static Integer age;
  public String location;
  public static String vacation;
  public static String height;
  public static String day;
  public static String sport;
  public String breakfast;

  public AboutMe(){
    name = "Kaitlin";
    hairColor = "Black";
    age = 16;
    location = "Tacoma";
    vacation = "she doesn't know where she is traveling yet";
    height = "5'5";
    day = "Friday";
    sport = "tennis";
    breakfast = "eggs, bread, and fruits";
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

//---------------------------------------------------------------------------------------------------
    else if (userIn.equals("2")){
      System.out.println("a.Normally");
      System.out.println("b.During vacation");

      Scanner aorb = new Scanner(System.in);
      String ab = newIn.next();
      if (ab.equals("a")){
        System.out.println("She's in " +K.location);
        System.out.println("---------------------");
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
        K.location = changeL.next();

        System.out.println("Got it, she is at " +K.location+ " now");
      }
    }
//---------------------------------------------------------------------------------------------------
    else if (userIn.equals("3")){
      System.out.println("Her favorite day in a week is " +K.day);
    }

    else if (userIn.equals("4")){
      System.out.println("She has " +K.hairColor+ " hair");
    }

//---------------------------------------------------------------------------------------------------

    else if (userIn.equals("5")){
      System.out.println("She usually eat " +K.breakfast+ "for breakfast");
      System.out.println("---------------------");
      System.out.println("Do you want to let she eat something else for breakfast?");
      System.out.println("e.yes");
      System.out.println("f.no");

      Scanner eorf = new Scanner(System.in);
      String ef = newIn.next();
      if (ef.equals("e")){
        System.out.println("What do you want her to eat?");
        Scanner changeB = new Scanner(System.in);
        K.breakfast = changeB.next();
        System.out.println("Well, occationally, she also eat " +K.breakfast);
  }
      else if (ef.equals("f")){
          System.out.println("Fine...she will eat those everyday.");
        }
    }

//---------------------------------------------------------------------------------------------------

    else if (userIn.equals("6")){
      System.out.println("She is " +K.age+ " now");
    }

    else if (userIn.equals("7")){
      System.out.println("She plays " +K.sport+ " all year");
    }

    /*Scanner aorb = new Scanner(System.in);
    String ab = newIn.next();
    if (ab.equals("a")){
      System.out.println("She's in " +K.location);
      System.out.println("---------------------");
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
      K.location = changeL.next();

      System.out.println("Got it, she is at " +K.location+ " now");
    } */

    /*Scanner eorf = new Scanner(System.in);
    String ef = newIn.next();
    if (ef.equals("e")){
      System.out.println("What do you want her to eat?");
      Scanner changeB = new Scanner(System.in);
      String newB = changeB.next();
      System.out.println("Well, occationally, she also eat " +newB);
}
    else if (ef.equals("f")){
        System.out.println("Fine...she will eat those everyday.");
      }*/



  }
}
