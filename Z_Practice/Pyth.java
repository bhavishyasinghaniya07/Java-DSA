import java.util.*;

public class Pyth {

  public static Boolean isRight(int a, int b, int c) {
    if ((a > b && a > c && a * a == b * b + c * c) || (b > a && b > c && b * b == a * a + c * c)
        || (c > a && c > b && c * c == a * a + b * b)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(isRight(a, b, c));
  }
}