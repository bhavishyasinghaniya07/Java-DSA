import java.util.*;

public class PrimeFact {

  public static ArrayList<Integer> primeFact(int n) {
    ArrayList<Integer> list = new ArrayList<>();

    int x = 2;
    while (n > 1) {
      if (n % x == 0) {
        list.add(x);
        n = n / x;
      } else {
        x++;
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int n = 2310;
    ArrayList<Integer> list = primeFact(n);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}
