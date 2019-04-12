import java.util.*;
import java.io.*;

public class Hash {




  public static void main(String[] args) {
    System.out.println("Please type in a number");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    //int input = 1;

    int m = a*13 + 5;
    if ((m % 2) == 0) {
      m = m * 23489 +323;
    }else if ((m % 3) == 0) {
      m = m * 32394 +329;
    }else if ((m % 5) == 0) {
      m = m * 52348 +433;
    }else if ((m % 7) == 0) {
      m = m * 73428 +674;
    }
    //System.out.println(modi1);
    char [] chars = String.valueOf(m).toCharArray();

    for (int j = 0; j<chars.length; j++) {
      //System.out.println(chars[j]);
      System.out.print(chars[j]);

      j = j+1;
    }
    System.out.println("");
  }
}
