//Manager.java
//Created 3/5

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager{
  // List<Student> student;
  String na = "";
  String le = "";
  String da = "";
  String ti = "";
  String lineToRemove = "";


  public static List uselist(){
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
    return students;
    }

    public static void writeOtxt(String na, String le, String da, String ti){
    try {
        File file = new  File("student.txt");

        // if file doesnt exists, then create it
      /*  if (!file.exists()) {
            file.createNewFile();
        }*/

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(na);
        bw.write(le);
        bw.write(da);
        bw.write(ti);
        bw.close();

        //System.out.println("Done");

    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

public static void removeOtxt(String lineToRemove){
  try{
  File inputFile = new File("student.txt");
  File tempFile = new File("studentb.txt");
  BufferedReader reader = new BufferedReader(new FileReader(inputFile));
  BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

  //String lineToRemove = "bbb";
  String currentLine;

  while((currentLine = reader.readLine()) != null) {
      // trim newline when comparing with lineToRemove
      String trimmedLine = currentLine.trim();
      if(trimmedLine.equals(lineToRemove)) continue;
      writer.write(currentLine + System.getProperty("line.separator"));
    }
    writer.close();
    reader.close();
    boolean successful = tempFile.renameTo(inputFile);
  }
  catch (Exception e) {
      e.printStackTrace();
  }

  }

  public static void writeNtxt(List t9, List t10, List t14, List t15){
  try {
      File file = new  File("Schedule.txt");




      FileWriter fw1 = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw1 = new BufferedWriter(fw1);

      String t9SpaceSeparated = String.join("\n", t9);
      String t10SpaceSeparated = String.join("\n", t10);
      String t14SpaceSeparated = String.join("\n", t14);
      String t15SpaceSeparated = String.join("\n", t15);

      bw1.write("六9:30");
      bw1.write(t9SpaceSeparated);
      bw1.write("六10：30");
      bw1.write(t10SpaceSeparated);
      bw1.write("六14：30");
      bw1.write(t14SpaceSeparated);
      bw1.write("六15：30");
      bw1.write(t15SpaceSeparated);
      bw1.close();

      //System.out.println("Done");

  }
  catch (Exception e) {
      e.printStackTrace();
  }
}
}
