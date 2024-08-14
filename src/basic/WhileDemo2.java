package basic;

import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  while(true){
    System.out.println("점수를 입력해주세요 ( 1~100 ) ");
int score = in.nextInt();

if (score <0) break;

String grade = "";
    switch (score) {
    case 10:
grade = "A";
    System.out.println(grade);
        break;
            case 9:
grade = "B";
    System.out.println(grade);
        break;
            case 8:
default:
grade = "c";
    System.out.println(grade);
    }
    // 여기까지를 계속 반복한다.
  }

  }
}