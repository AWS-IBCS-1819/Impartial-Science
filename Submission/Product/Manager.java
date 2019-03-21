//Manager.java
//Created 3/5

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Manager{
  String na = "";
  String le = "";
  String da = "";
  String ti = "";


  public static List uselist(){
    List<Student> students = new ArrayList();

    try{
      File file = new File("student.txt");
      Scanner scan = new Scanner(file);

      while (scan.hasNext()) {
        Student student = new Student();
        student.name = scan.next();
        student.level = scan.next();
        student.day = scan.next();
        student.time = scan.next();
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
        File file = new File("student.txt");

        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(na+" ");
        bw.append(le+" ");
        bw.append(da+" ");
        bw.append(ti+"\n");
        bw.close();
        fw.close();

    }
    catch (Exception e) {
        e.printStackTrace();
    }
}




  public static void writeNtxt(List t9, List t10, List t14, List t15,List t91, List t101, List t141, List t151){
try {
    File file = new  File("Schedule.txt");

    FileWriter fw1 = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw1 = new BufferedWriter(fw1);


    String t9SpaceSeparated = String.join("\n", t9);
    String t10SpaceSeparated = String.join("\n", t10);
    String t14SpaceSeparated = String.join("\n", t14);
    String t15SpaceSeparated = String.join("\n", t15);
    String t91SpaceSeparated = String.join("\n", t91);
    String t101SpaceSeparated = String.join("\n", t101);
    String t141SpaceSeparated = String.join("\n", t141);
    String t151SpaceSeparated = String.join("\n", t151);

    bw1.write("六9:30"+"\n");
    bw1.write(t9SpaceSeparated);
    bw1.write("\n"+"\n"+"六10：30"+"\n");
    bw1.write(t10SpaceSeparated);
    bw1.write("\n"+"\n"+"六14：30"+"\n");
    bw1.write(t14SpaceSeparated);
    bw1.write("\n"+"\n"+"六15：30"+"\n");
    bw1.write(t15SpaceSeparated);
    bw1.append("\n"+"\n"+"日9:30"+"\n");
    bw1.write(t91SpaceSeparated);
    bw1.write("\n"+"\n"+"日10：30"+"\n");
    bw1.write(t101SpaceSeparated);
    bw1.write("\n"+"\n"+"日14：30"+"\n");
    bw1.write(t141SpaceSeparated);
    bw1.write("\n"+"\n"+"日15：30"+"\n");
    bw1.write(t151SpaceSeparated);
    bw1.close();
    fw1.close();


}
catch (Exception e) {
    e.printStackTrace();
}
}
}
