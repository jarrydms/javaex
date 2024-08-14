package basic;
public class MehodDemo {
  public static void main(String[] args) {
   System.out.println(sum(1,10));
   System.out.println(sum(1,100));
   System.out.println(sum(1,1000));
    /**
     *
     *
     *
     */
//
//
//    int sum = 0;
//      for (int i = 0; i <= 10; i++)
//        sum += i;
//      System.out.println("합(1~10) : " + sum);
//      sum = 0;
//      for (int i = 10; i <= 100; i++)
//        sum += i;
//      System.out.println("합(10~100) : " + sum);
//      sum = 0;
//      for (int i = 100; i <= 1000; i++)
//        sum += i;
//      System.out.println("합(100~1000) : " + sum);

  }
  public static int sum(int start, int end ){

    int sum =0;
    for (int i = start; i <= end; i++) {
      sum = sum + i;
    }

    return sum;
    }

  }

