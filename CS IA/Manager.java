//Manager.java
//Created 3/5

import java.util.*;
import java.io.*;

public class Manager{
  // List<Student> student;


  public static void main(String[] args) {
    ArrayList<String> t9 = new ArrayList<String>();
    ArrayList<String> t10 = new ArrayList<String>();
    ArrayList<String> t14 = new ArrayList<String>();
    ArrayList<String> t15 = new ArrayList<String>();

    List<Student> students = new ArrayList();

    try{
      File file = new File("student.txt");
      Scanner scan = new Scanner(file);

      while (scan.hasNextLine()) {
        Student student = new Student();
        student.setName(scan.next());
        student.setLevel(scan.next());
        student.setDay(scan.next());
        student.setTime(scan.next());
        students.add(student);
      }

    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
    }
  }//
