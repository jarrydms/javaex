package basic;
public class ReturnDemo {

  public static void main(String[] args) {
    printscore(120);
    printscore(11);
  }

  public static void printscore(int score) {
    if (score < 0 || score > 100) {
      System.out.println("잘못된숫자입니다.");
      return;
    }

    System.out.println("점수" + score);

  }
}
