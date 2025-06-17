public class GcdAndLcm {

  public static int gcd(int a, int b) {
    while (a % b != 0) {
      int rem = a % b;

      a = b;
      b = rem;
    }
    return b;
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static void main(String[] args) {
    int a = 24;
    int b = 36;

    System.out.println("GCD of both the numbers is : " + gcd(a, b));
    System.out.println("LCM of both the numbers is : " + lcm(a, b));
  }
}