package basic;

public class MethodDemo2 {
  public static void main(String[] args) {
    oddOrEven(2); //짝수
    oddOrEven(5); //홀수
    oddOrEven(10); //짝수
//   int num =2;
//     String result ="";
//        result = (num%2==0) ? "짝수" :  "홀수";
//     System.out.printf("%d는 %s입니다", num ,result);
//
//   num=5;
//   result = "";
//   result = (num % 2 == 0) ? "짝수" : "홀수";
//    System.out.printf("%d는 %s입니다", num ,result);
   }
   public static void oddOrEven(int num) {
    String result= "";
    result =(num%2==0)?"짝수" : "홀수";
    System.out.printf("%d는 %s입니다", num ,result);
     System.out.println("");
   }
  }


