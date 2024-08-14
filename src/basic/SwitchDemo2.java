  package basic;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    System.out.println("요일입력");
    Scanner in = new Scanner(System.in);
    String day = in.nextLine();
    switch(day){
//      case num:
//      case 1.0:
      case "mon":
      case "tue":
      case "wed":
      case "thu":
      case "fri":
        System.out.println("평일입니다");
        break;
      case "sat":
      case "sun":
        System.out.println("주말입니다");
        break;
      default:
        System.out.println("알수 없는 요일");
    }
  }
}
