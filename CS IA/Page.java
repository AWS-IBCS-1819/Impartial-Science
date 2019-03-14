//Window.java
//Created 3/8

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Page extends Frame{

  private TextField tf1;
  private TextField tf2;
  private TextField tf3;
  private TextField tf4;
  private TextField tf5;
  private Button b1;
  private Button b2;
  private Button b3;
  private Button b4;
  private Button b5;
  private Label l1;
  private Label l2;
  private Label l3;
  private Label l4;
  private Label l5;
  private Label l6;
  private Label l7;
  private Label l8;
  private Label l9;
  private Label l10;
  private Frame f2;
  private Frame f3;
  private Frame f4;
  private Frame f5;
  private Student students;

  public Page(List<Student> students){
    //to close the System
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });




    //for frame 2--------------------------------------------------------------
    f2 = new Frame();
    f2.setSize(600,700);
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    l3 = new Label("Welcome to the Parent/Student page");
    l3.setBounds(200,50,400,30);
    f2.add(l3);

    tf2 = new TextField("please type in the name of the student here");
    tf2.setBounds(300,100,200,50);
    f2.add(tf2);

    tf4 = new TextField("please type in the name of the student here");
    tf4.setBounds(300,100,200,50);
    f2.add(tf4);

    b6 = new Button("check info");
    b6.setBounds(500,450,100,50);
    f2.add(b6);
    b6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        String 2 = tf2.getText();
        Student.add(2);

      //add student
      //add another TextField for the user to text in the student's name and
      //then read the input and add the student to the txt File
      }
    });

    //for frame 3--------------------------------------------------------------
    f3 = new Frame();
    f3.setSize(600,700);
    f3.setLayout(null);
    f3.setVisible(false);
    f3.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    l4 = new Label("Welcome to the Staff page");
    l4.setBounds(200,50,400,30);
    f3.add(l4);

    b3 = new Button("new Schedule");
    b3.setBounds(270,100,100,50);
    f3.add(b3);
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f4.setVisible(true);
        for (int i = 1; i<students.size();i++){

          if (student(i).time= "9:30"){
            Manager.t9.add(student(i).name);
          }
          if (student(i).time = "10:30"){
            manager.t10.add(student(i).name);
          }
          if (student(i).time = "14:30"){
            Manager.t14.add(student(i).name);
          }
          if (student(i).time = "15:30"){
            Manager.t15.add(student(i).name);
          }
        } // for loop end
      }
    });

    tf3 = new TextField("please type in the name of the student here");
    tf3.setBounds(300,100,200,50);
    f3.add(tf3);

    b4 = new Button("add Student");
    b4.setBounds(100,150,100,50);
    f3.add(b4);
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        String 3 = tf3.getText();
        Student.add(3);
      }
    });

    b5 = new Button("delete Student");
    b4.setBounds(300,150,100,50);
    f3.add(b5);
    b5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
      //delete student
      //add another TextField for the user to text in the student's name and
      //then read the input and delete the student from the txt File
      }
    });




    //for frame 4--------------------------------------------------------------
    f4 = new Frame();
    f4.setSize(600,700);
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

    /*l6 = new Lable("student in 9:30");
    l6.setBounds(100,50,400,400);
    f4.add(l6);*/



    //for frame 1--------------------------------------------------------------
    setSize(600,700);
    setLayout(null);
    setVisible(true);
    setBackground(Color.pink);

    l1 = new Label("Welcome to Shang Jie Swiming Club");
    l1.setBounds(190,50,400,30);
    add(l1);

    l2 = new Label("Select parent/student or staff");
    l2.setBounds(210,120,500,30);
    add(l2);

    b1 = new Button("Parent/Student");
    b1.setBounds(50, 150, 150, 30);
    add(b1);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f2.setVisible(true);
      }
    });

    b2 = new Button("Staff");
    b2.setBounds(400,150,150,30);
    add(b2);

    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f3.setVisible(true);
      }
    });




}
public static void main(String[] args) {
  Page p = new Page();
}
}
