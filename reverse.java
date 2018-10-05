import java.io.*;
import java.util.*;

public class reverse{

    //recursive
    public static int recursive(int z){
      if(z.length() > 1){//if there is something in there (more than 1 letter)
        return recursive(z.substring(1) + w.charAt(0));
      }

      else {//if there is only one letter, just going print out the same thing
        return z;
      }
    }
    public static void main(String[] args) {
      System.out.println("Please type in a sentence or word, and I will reverse it for you");
      Scanner sc = new Scanner(System.in);//scanner
      String in = sc.nextLine();

      //recursive
      String reverse = recursive(in);
      System.out.println(reverse);

      System.out.println("---------------------------------------------");


      //loop
      for (int i = word.length() -1; i >= 0; i--){//looping through the string
        System.out.print(word.charAt(i));
      }

    }
  }
