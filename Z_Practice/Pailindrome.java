public class Pailindrome {

  public static int reverse(int n) {
    int rev = 0;

    while (n > 0) {
      rev = rev * 10 + n % 10;
      n = n / 10;
    }
    return rev;
  }

  public static boolean isP(int n) {
    int rev = reverse(n);

    while (n > 0 && rev > 0) {
      if (n % 10 != rev % 10) {
        return false;
      }
      rev = rev / 10;
      n = n / 10;
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 1321;
    System.out.println(isP(n));
  }

}