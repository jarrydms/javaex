package basic;

public class AdderDemo {
  public static void main(String[] args) {

   int i = 0, j;
   j = i++;
    System.out.printf("i = %d , j = %d // ", i,j);
   // j = i++; // 후위연산자
  //  System.out.println("i=%d,j=%d", i,j);
    int x = 0, y;
    y = ++x;
    System.out.printf("x = %d , y = %d", x,y);
  }
}
