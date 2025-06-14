import java.util.*;

class Prime {
  public static boolean isPrime(int n) {
    if (n == 1 || n == 2)
      return true;

    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int n = 73;
    System.out.println(isPrime(n));
  }
}
