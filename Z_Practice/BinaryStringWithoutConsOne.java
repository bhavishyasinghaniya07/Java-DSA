
public class BinaryStringWithoutConsOne {

  public static void print(String s, int i, int n, int prev) {
    if (n == i) {
      System.out.println(s);
      return;
    }

    print(s + '0', i + 1, n, 0);

    if (prev == 0) {
      print(s + '1', i + 1, n, 1);
    }
  }

  public static void main(String[] args) {
    print(new String(), 0, 6, 0);
  }
}
