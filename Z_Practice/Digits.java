public class Digits {

  public static int countDigit(int n) {
    int count = 0;
    int x = n;

    while (x > 1) {
      count++;
      x = x / 10;
    }
    return count;
  }

  public static void main(String[] args) {
    int n = 345343432;
    System.out.println(countDigit(n));
  }

}
