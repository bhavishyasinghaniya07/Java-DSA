import java.util.*;

public class Inverse {

  public static int inverse(int n) {

    int inv = 0;
    int i = 1;
    while (n > 0) {
      int x = n % 10;
      inv += (i * Math.pow(10, x - 1));
      i++;
      n /= 10;
    }

    return inv;

  }

  public static void main(String[] args) {
    int n = 21453;

    System.out.println(inverse(n));
  }
}