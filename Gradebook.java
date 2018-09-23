/* Gradebook.java by Vivian Yip & Maggie Zhang
This class holds all of the information for Gradebook
which reads a gradebook file and calculates certain
values for the teacher. Then it gives output based
off user feedback.
*/

import java.util.*;
import java.io.*;
public class Gradebook {
  public static String val;


  public static void main(String[] args) {
    Scanner in1= new Scanner(System.in);
    System.out.println("Welcome to the Student Gradebook, what would you like to see?");
    System.out.println("1. Mean Grade");
    System.out.println("2. Grade Spread");
    System.out.println("3. Top Grade");
    System.out.println("4. Lowest Grade");
    System.out.println("5. Class Subject and Teacher");
    System.out.println("6. Student Roster");
    //String a = in1.nextLine();
  /*  if (a.equals("1")){
      System.out.println("The class mean grade was " + meanGrade() + ".");
    }
    else if (a.equals("2")){
      System.out.println("The class grade spread was " + gradeBook.gradeSpread() + ".");
    }
    else if (a.equals("3")){
      System.out.println("The class top grade was " + gradeBook.topGrade() + ".");
    }
    else if (a.equals("4")){
      System.out.println("The class lowest grade was " + gradeBook.lowestGrade() + ".");
    }
    else if (a.equals("5")){
      System.out.println("The class's subject was " + gradeBook.classSubject() + ".");
      System.out.println("The class's teacher was " + gradeBook.classTeacher() + ".");
    }
    else if (a.equals("6")){
      System.out.println("The class's student roster is shown below: ");
      System.out.println(gradeBook.classStudent());
    }*/

    StringBuilder intStr = new StringBuilder();
    StringBuilder myStr = new StringBuilder();
    int count = 0;
    //String val = "0";
    try {
      File grade = new File("grade.txt");
      Scanner sc = new Scanner(grade);

      while (sc.hasNext()) { //checks to see if our file is empty
        myStr.append(sc.next() + "\n ");
    //  myStr = sc.nextLine();
    /*  if(myStr.equals("%")){
        val = (myStr.substring(0, myStr.indexOf("%")));
      }
      intStr.append(val); */



            //count++;
      }
    }

    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(myStr);
    //System.out.println(intStr);
    //Scanner a = new Scanner(myStr.toString());

    for (int i = 0; i < myStr.length(); i = i + 4){
      if(myStr.equals("%")){
        val = (myStr.substring(0, myStr.indexOf("%")));
      }
      intStr.append(val);
      //intStr.append()(char(i));
      //intStr.append(" ");
    }

    System.out.println(intStr);





}



  /*  public void meanGrade(){

    }

    public void gradeSpread(){

    }

    public void topGrade(){

    }

    public void lowestGrade(){

    }

    public void classSubject(){

    }

    public void classTeacher(){

    }

    public void classStudent(){

    }*/

  }
