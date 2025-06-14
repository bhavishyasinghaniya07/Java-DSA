public class Fibonacci {

  public static void generateFibonacci(int n) {
    if (n < 1) {
      System.out.println("No Fibonacci numbers up to " + n);
      return;
    }

    System.out.print(1 + " ");
    int a = 1;
    int b = 1;

    if (n >= 2) {
      System.out.print(1 + " ");
    }

    while (a + b <= n) {
      int c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }

  public static void main(String[] args) {
    int n = 100;
    generateFibonacci(n);
  }
}
