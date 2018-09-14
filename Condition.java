import java.util.*;
import java.io.*;

public class Condition{

  public static void main(String[] args) {
    StringBuilder myStr = new StringBuilder();
    int count = 0;

    try{
      File randtxt = new File("K(book).txt");
      Scanner sc = new Scanner(randtxt);

      while (sc.hasNext());{ //check to see if the file is empty
        myStr.append(sc.nextLine() +"\n"); //add on to the end of the StringBuilder
        //nextLine or next determined how it reads import junit.framework.TestCase;
        //" " or "\n"controls the space between it
        count++;
      }
    }

    catch (FileNotFoundException e){
      e.printStackTrace();
    }

    System.out.println(myStr);

    int num0 = 0;
    for (int i = 0; i < count - 2; i++){

      if (myStr.substring(i, i+2).equals("Hi")){//try to find Hi
        System.out.println(myStr.substring(i, i+2));
        num0++;
      }
    }

    System.out.println("Number of 'Hi' in K: " + num0);
  }

}
