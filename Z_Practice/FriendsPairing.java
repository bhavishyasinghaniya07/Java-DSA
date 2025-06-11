public class FriendsPairing {

  public static int helper(int n) {

    if (n == 1 || n == 2)
      return n;

    int single = helper(n - 1);
    int paired = (n - 1) * helper(n - 2);

    return single + paired;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(helper(n));
  }
}
