package basic;

public class Sum {

  public static void main(String[] args) {

    int sum=0;
    for (int i = 1; i<=100; i++){
      sum = sum + i;
    }
    System.out.println("1~10합은" + sum);
  }
}
