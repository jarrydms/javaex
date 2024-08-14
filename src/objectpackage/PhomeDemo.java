package objectpackage;

public class PhomeDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone(); // ctrl + alt + v
    p1.model ="갤럭시 z 폴드6";
    p1.price = 2_586_000;
    p1.print();
    Phone p2 = new Phone();
    p2.model = "iPhone 15프로";
    p2.price = 2_320_000;
    p2.print();

  }
}
