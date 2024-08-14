package basic;

public class whileDemo {
  public static void main(String[] args) {

    int count =0;
    System.out.println("while문");
    while(count<3) {
      count++;
      System.out.println(count);
    }

    System.out.println("for문");
    for(int i =0; i<3;i++){
      System.out.println(i+1);
    }
    count=0;


    while(true){
      count ++;
      System.out.println(count);
      if(count>=3){
        break;
      }
    }

    }
  }
