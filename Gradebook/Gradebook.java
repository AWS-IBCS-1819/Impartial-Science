/*
Producer: Vivian Yip & Maggie Zhang
Project: Gradebook.java
Date: 9/26/2018

Description: This class holds all of the information for Gradebook
which reads a gradebook file and calculates certain
values for the teacher. Then it gives output based
off user feedback.
*/

import java.util.*;
import java.io.*;

public class Gradebook {


 public static void main(String[] args) {   //main method

   String a;                               //substring
   Double total;                           //sum of all students' grade (component for calculating the mean)
   Double avg;                             //mean grade
   Double tn;                              //top grade
   Double ln;                              //low grade


                                            //setting up different StringBuilder to store different information

   StringBuilder cjStr = new StringBuilder();//stringbuilder of grade
   StringBuilder myStr = new StringBuilder();//
   StringBuilder mzStr = new StringBuilder();//stringbuilder of student roster
   StringBuilder kcStr = new StringBuilder();//stringbuilder of subject
   StringBuilder lsStr = new StringBuilder();//stringbuilder of teacher
   int count = 0;                            //how many times it loops (how many grades there are in the text file, used when finding the mean)
   int ga = 0;                              //number of students getting Grade A
   int gb = 0;                              //number of students getting Grade B
   int gc = 0;                              //number of students getting Grade C
   int gd = 0;                              //number of students getting Grade D
   int gf = 0;                              //number of students getting Grade F or less
   tn = 0.0;                                //double of top grade
   ln = 101.0;                              //double of lowest grade

   try {                                    //reading the file
     File grade = new File("grade.txt");
     Scanner sc = new Scanner(grade);

     kcStr.append(sc.next() + " ");         //putting the first five words into different StringBuilders
     kcStr.append(sc.next() + " ");
     myStr.append(sc.next() + " ");
     lsStr.append(sc.next() + " ");
     lsStr.append(sc.next() + " ");

     while (sc.hasNext()) {               //use a while loop to check to see if our file is empty
       mzStr.append(sc.next() + " ");     //now scanning from the sixth word and putting them different StringBuilders
       mzStr.append(sc.next() + " \n");
       myStr.append(sc.next() + " ");
       cjStr.append(sc.next() + "");
     }
  }
   catch (FileNotFoundException e) {
     e.printStackTrace();
   }

                                          //start of our methods for each category
   total = 0.0;                           //set the double variable total initially equals to 0.0
   for (int i = 0; i < cjStr.length(); i = i + 5){     // loop for going through a stringbuilder at every 5th interval
     a = cjStr.substring(i, i+4);         //disregard the "%"
     Double b = Double.parseDouble(a);    //method for converting string to double
     total = total + b;                   //sum of grades
     count ++;                            //total number of grades

     if (b > tn){                         //method finding the top grade
       tn = b;                            //if the next number is greater than the last greatest one, replace it and become the current top grade
     }
     if (b < ln){                         //method finding the minimum
       ln = b;                           //if the next number is lower than the last lowest one, replace it and become the current lowest grade
     }


     if (b > 90.0){                      //method for calculating the grade spread
       ga++;                             //A = 90+
     }
     else if (b > 80.0 && b < 90.0){
       gb++;                            //B = 80-90
     }
     else if (b > 70.0 && b < 80.0){
       gc++;                           //C = 70-80
     }
     else if (b > 60.0 && b < 70.0){
       gd++;                           //D = 60-70
     }
     else {
       gf++;                          //F = lower grades
     }
    }
    avg = total / count;              //method to find the mean grade



   Scanner in1= new Scanner(System.in);   //trying to get the user's choice
   System.out.println("Welcome to the Student Gradebook, what would you like to see?");
   System.out.println("1. Mean Grade");
   System.out.println("2. Grade Spread");
   System.out.println("3. Top Grade");
   System.out.println("4. Lowest Grade");
   System.out.println("5. Class Subject and Teacher");
   System.out.println("6. Student Roster");
   System.out.println("7. Exit");
   String choice = in1.nextLine();      //catch input

   if (choice.equals("1")){             //print out response and get method according to user's input
     System.out.println("The class mean grade was " + avg + "%");
   }
   else if (choice.equals("2")){
     System.out.println("The number of students getting A is " + ga + ".");
     System.out.println("The number of students getting B is " + gb + ".");
     System.out.println("The number of students getting C is " + gc + ".");
     System.out.println("The number of students getting D is " + gd + ".");
     System.out.println("The number of students getting F is " + gf + ".");
   }
   else if (choice.equals("3")){
     System.out.println("The class top grade is " + tn + "%");
   }
   else if (choice.equals("4")){
     System.out.println("The class lowest grade is " + ln + "%");
   }
   else if (choice.equals("5")){
     System.out.println("The class's subject is " + kcStr + ".");
     System.out.println("The class's teacher is " + lsStr + ".");
   }
   else if (choice.equals("6")){
     System.out.println("The class's student roster is shown below: ");
     System.out.println(mzStr);
   }
   else if (choice.equals("7")){
     System.exit(0);
   }
   else {
     System.out.println("The system cannot answer to your command!");
     System.out.println("Please make sure that you entered a valid number.");
   }






}

}
