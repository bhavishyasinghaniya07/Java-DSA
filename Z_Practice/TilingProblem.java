
public class TilingProblem {

  public static int ways(int n) {
    if (n == 0 || n == 1)
      return 1;

    return ways(n - 1) + ways(n - 2);
  }

  public static void main(String[] args) {
    int n = 2;
    System.out.println(ways(n));
  }
}
