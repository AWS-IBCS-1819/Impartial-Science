//Window.java
//Created 3/8

import java.awt.*;
import java.awt.event.*;

public class Window extends Frame{

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

  public Window(){
    //to close the System
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    setSize(600,700);
    setLayout(null);
    setVisible(true);
    setBackground(Color.pink);




    //for frame 1
  /*  l1 = new Label("Welcome to Shang Jie Swiming Club");
    l1.setBounds(50,50,200,30);
    add(l1);

    l2 = new Label("Select parent/student or staff");
    l2.setBounds(50,120,500,30);
    add(l2);

    b1 = new Button("Parent/Student");
    b1.setBounds(50, 150, 150, 30);
    add(b1);

    b2 = new Button("Staff");
    b2.setBounds(400,150,150,30);*/

    public static void main(String[] args) {
      Window w = new Window();

    }
}
}
