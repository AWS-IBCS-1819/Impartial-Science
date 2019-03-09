//Manager.java
//Created 3/5

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager{
  // List<Student> student;


/*  public static void main(String[] args) {
    Student a = new Student();
  }*/
    //ArrayList<int> num = new ArrayList<int>(); list of num of student
    //ArrayList<String> name = new ArrayList<String>(); list of names
    //ArrayList<String> time = new ArrayList<String>(); list of time
    //ArrayList<String> day = new ArrayList<String>(); list of day
    //ArrayList<int> level = new ArrayList<int>(); list of level
    List<Student> student = new ArrayList();
  //  public Maneger(){
      // student = new ArrayList<Student>();
      // t9 = new ArrayList<String>();
      // t10 = new ArrayList<String>();
      // t14 = new ArrayList<String>();
      // t15 = new ArrayList<String>();

    try{
      File student = new File("student.txt");
      Scanner scan = new Scanner(student);

      while (scan.hasNextLine()) {
        Student student = new Student();
        s.setName(stu.next());
        s.setLevel(stu.next());
        s.setDay(stu.next());
        s.setTime(stu.next());
        student.add(s);
      }

      //num.add(stu.next()+ " ");
      //name.add(stu.next()+ " ");
      //level.add(stu.next()+ " ");
      //day.add(stu.next()+ " ");
      //time.add(stu.next()+ " ");
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }//


}
