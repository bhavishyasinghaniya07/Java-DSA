import java.util.*;

public class Prime {
  public static boolean isPrime(int n) {
    if (n == 1)
      return false;
    if (n % 2 == 0)
      return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void printPrime(int n) {

    for (int i = 2; i <= n; i++) {
      if (isPrime(i))
        System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int n = 73;
    System.out.println(isPrime(n));
    printPrime(n);
  }
}