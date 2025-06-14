public class Reverse {

  public static int reverseNo(int n) {
    int x = 0;

    while (n > 1) {
      int a = n % 10;
      x = x * 10 + a;
      n = n / 10;
    }

    return x;
  }

  public static void main(String[] args) {
    int n = 24317;
    System.out.println(reverseNo(n));
  }

}