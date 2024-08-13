package basic;
import java.util.Scanner;
public class DivideByZeroDemo {
  public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
//   double result = 5 / 2.0;
//// double result = 5 % 0.0;
//// System.out.printf("5 나머지 연산 2.0은  %.2f 입니다.",result);
//
// System.out.printf("5 나누기 2.0은 %.2f 입니다.",result) ;
// System.out.println("양수 & 정수 입력 : ");
//   int i  = in.nextInt();
//  if(i == 0) {
//    System.out.println("0으로 나뉠수 없습니다.")result;
// }
//  if(i > 0) {
//  int result = 5 / i;
//    System.out.printf("5 나누기 %d는 %d입니다.", i, result);
 // }

    //jvm 메모리 사용 원리확인하기
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    System.out.println("Scanner 각각생성 후 비교"+ (in2 == in));

    in2 = in;

    System.out.println("Scanner 주소값 복사 후 비교 " + (in2 == in));
    double result = 5 % 0.0 + 200;

    }
}
