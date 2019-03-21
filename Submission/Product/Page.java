//Window.java
//Created 3/8

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Page extends Frame{

  private TextField tf1;
  private TextField tf3;
  private TextField tf5;
  private TextField tf6;
  private Button b2;
  private Button b3;
  private Button b4;
  private Label l1;
  private Label l4;
  private Label l5;
  private Label l7;
  private Label l8;
  private Label l9;
  private Label l10;
  private Frame f3;
  private Frame f4;
  private Frame f5;
  List<Student> students;
  List<String> t9 = new ArrayList<String>();
  List<String> t10 = new ArrayList<String>();
  List<String> t14 = new ArrayList<String>();
  List<String> t15 = new ArrayList<String>();
  List<String> t91 = new ArrayList<String>();
  List<String> t101 = new ArrayList<String>();
  List<String> t141 = new ArrayList<String>();
  List<String> t151 = new ArrayList<String>();


  public Page(){
    //to close the System
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    //for frame 3--------------------------------------------------------------
    f3 = new Frame();
    f3.setSize(800,700);
    f3.setLayout(null);
    f3.setVisible(false);
    f3.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    l4 = new Label("Welcome to the Staff page");
    l4.setBounds(300,50,400,30);
    f3.add(l4);

    b3 = new Button("new Schedule");
    b3.setBounds(450,600,200,50);
    f3.add(b3);
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f4.setVisible(true);
        students = Manager.uselist();

        for (Student student : students){

          if (student.time.equals("9:30")&& student.day.equals("六")){
            t9.add(student.name);
          }
          else if (student.time.equals("10:30")&&student.day.equals("六")){
            t10.add(student.name);
          }
          else if (student.time.equals("14:30")&&student.day.equals("六")){
            t14.add(student.name);
          }
          else if (student.time.equals("15:30")&&student.day.equals("六")){
            t15.add(student.name);
          }
          if (student.time.equals("9:30")&& student.day.equals("日")){
            t91.add(student.name);
          }
          else if (student.time.equals("10:30")&&student.day.equals("日")){
            t101.add(student.name);
          }
          else if (student.time.equals("14:30")&&student.day.equals("日")){
            t141.add(student.name);
          }
          else if (student.time.equals("15:30")&&student.day.equals("日")){
            t151.add(student.name);
          }

        }
        Manager.writeNtxt(t9, t10, t14, t15, t91, t101, t141, t151);
      }
    });

    //add students
    l7 = new Label("please type in the name of the student here");
    l7.setBounds(100,200,400,50);
    f3.add(l7);
    l8 = new Label("please type in the level the student is at right now");
    l8.setBounds(100,300,400,50);
    f3.add(l8);
    l9 = new Label("please type in the date you want here "+"\n"+"“六，日”");
    l9.setBounds(100,400,400,50);
    f3.add(l9);
    l10 = new Label("please type in the time you want here "+"\n"+"“9:30, 10:30, 14:30, 15:30”");
    l10.setBounds(100,500,500,50);
    f3.add(l10);

    tf1 = new TextField("");
    tf1.setBounds(600,200,100,50);
    f3.add(tf1);
    tf3 = new TextField("");
    tf3.setBounds(600,300,100,50);
    f3.add(tf3);
    tf5 = new TextField("");
    tf5.setBounds(600,400,100,50);
    f3.add(tf5);
    tf6 = new TextField("");
    tf6.setBounds(600,500,100,50);
    f3.add(tf6);

    b4 = new Button("add Student");
    b4.setBounds(150,600,200,50);
    f3.add(b4);
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        String na = tf1.getText();
        String le = tf3.getText();
        String da = tf5.getText();
        String ti = tf6.getText();
        Manager.writeOtxt(na,le,da,ti);
      }
    });


    //for frame 4--------------------------------------------------------------
    f4 = new Frame();
    f4.setSize(320,100);
    f4.setLayout(null);
    f4.setVisible(false);
    f4.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    l5 = new Label("The schedule has been changed");
    l5.setBounds(50,50,250,30);
    f4.add(l5);


    //for frame 1--------------------------------------------------------------
    setSize(600,200);
    setLayout(null);
    setVisible(true);
    setBackground(Color.pink);

    l1 = new Label("Welcome to Shang Jie Swiming Club");
    l1.setBounds(200,50,400,30);
    add(l1);



    b2 = new Button("Staff");
    b2.setBounds(230,150,150,30);
    add(b2);

    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f3.setVisible(true);
      }
    });




}
public static void main(String[] args) {
  Page page = new Page();

}
}
