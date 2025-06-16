public class Rotate {

  public static int rotate(int n, int r) {
    int temp = n;
    int x = -1;

    while (r > 0) {
      if (x == -1)
        x = temp % 10;
      else
        x = (temp % 10) * 10 + x;

      temp /= 10;
      r--;
    }

    int count = 1;
    int temp2 = temp;

    while (temp > 0) {
      count *= 10;
      temp /= 10;
    }

    return x * count + temp2;

  }

  public static void main(String[] args) {
    int n = 12345;
    int r = 2;

    System.out.println(rotate(n, r));
  }
}