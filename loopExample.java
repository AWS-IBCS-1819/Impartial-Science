//loop example

public class loopExample{

  public static void main(String[] args) {
    int sum = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int j = 0;
    int k = 0;
    int x;
    int tn;
    int m = 16;
    int p = 1;

//example
/*    for (int i = 0; i < 11; i++){
      //condition for the loop
      //int i start at zero
      //if i is larger than 11, the loop will stop
      //each time it loop through, i+1

    }*/

    //question 2
    for(int z = x; z < y; x++){
      sum = x + sum;
    }
    return sum;

    //question 3
    String z = "1999429349923469829932749023799993649899";
    for (int i = 0; i < z.length(); i++){
      if (charAt(i).equals ("0")){
        a++;
      }
      //checking how many of each number is in the list
      else if (charAt(i).equals ("1")){
        b++;
      }
      else if (charAt(i).equals ("2")){
        c++;
      }
      else if (charAt(i).equals ("3")){
        d++;
      }
      else if (charAt(i).equals ("4")){
        e++;
      }
      else if (charAt(i).equals ("5")){
        f++;
      }
      else if (charAt(i).equals ("6")){
        g++;
      }
      else if (charAt(i).equals ("7")){
        h++;
      }
      else if (charAt(i).equals ("8")){
        j++;
      }
      else if (charAt(i).equals ("9")){
        k++;
      }
//testing for the most common digit
      if (a > b && a > c && a > d && a > e && a > f && a > g && a > h && a > j && a > k){
        tn = a;
      }
      if (b > a && b > c && b > d && b > e && b > f && b > g && b > h && b > j && b > k){
        tn = b;
      }
      if (c > b && c > a && c > d && c > e && c > f && c > g && c > h && c > j && c > k){
        tn = c;
      }
      if (d > b && d > c && d > a && d > e && d > f && d > g && d > h && d > j && d > k){
        tn = d;
      }
      if (e > b && e > c && e > d && e > a && e > f && e > g && e > h && e > j && e > k){
        tn = e;
      }
      if (f > b && f > c && f> d && f > e && f > a && f > g && f > h && f > j && f > k){
        tn = f;
      }
      if (g > b && g > c && g > d && g > e && g > f && g > a && g > h && g > j && g > k){
        tn = g;
      }
      if (h > b && h > c && h > d && h > e && h > f && h > g && h > a && h > j && h > k){
        tn = h;
      }
      if (j > b && j > c &&  > d && j > e && j > f && j > g && j > h && j > a && j > k){
        tn = j;
      }
      if (k > b && k > c && k > d && k > e && k > f && k > g && k > h && k > j && k > a){
        tn = k;
      }

    }
    return tn;

    //question 5
    for (int n = 1; n < m; n++){
      p = p * n;
    }
    return p;
  }
}
