package basic;

public class methodDemo4 {
  public static void main(String[] args) {
//method 이름 minus 매개변수 2개 int 빼기 곱하기 나누기
    //method type int

    int num1=10 , num2 = 10;
    System.out.println("=====더하기=====");
    System.out.println(add(num1,num2));
    System.out.println("=====빼기=====");
    System.out.println(minus(num1,num2));
    System.out.println("=====곱하기=====");
    System.out.println(multiply(num1,num2));
    System.out.println("=====나누기=====");
    System.out.println(divide(num1,num2));

  }

  public static int minus(int a , int b){
    return a - b;
  }
  public static int multiply(int a , int b){
    return a * b;
  }
  public static int divide(int a , int b){
    if(b==0) return 0;
    return a / b;
  }

  public static int add(int a ,int b){
    return a + b;
  }


}
    // methoad name add / value 2 / type int
    //2개의 숫자를 더해서 반환하는 메서드를 만들어보기
    // return int
    //add(2,3)  add(10, 20) add(100,200)


//
//  }

