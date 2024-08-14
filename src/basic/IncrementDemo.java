package basic;

public class IncrementDemo {
  public static void main(String[] args) {

    int x = 0;

    System.out.println("increment 메소드호출전 x =" + x);
    increment(x);
    System.out.println("increment 메소드호출전 x =" + x);
  }
  public static void increment(int n){

    System.out.println("increment 메소드시작 n =" + n);
    n++;
    System.out.println("increment 메소드종료 n =" + n);


  }
}
