//Student.java
//Created on 3/5

public class Student {
  String name;
  String time;
  String day;
  String level;

  /*public void newStu (String n, int l, String d, String t){
    name = n;
    level = l;
    day = d;
    time = t;
  }*/
  public Student(){
    name = "";
    level = "";
    day = "";
    time = "";
  }


  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name;
  }

  public void setTime(String t){
    time = t;
  }

  public String getTime(){
    return time;
  }

  public void setDay(String d){
    day = d;
  }

  public String getDay(){
    return day;
  }

  public void setLevel(String l){
    level = l;
  }

  public String getLevel(){
    return level;
  }





}
