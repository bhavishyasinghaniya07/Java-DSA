public class CheckDuplicate {
  public static String checkDuplicate(String s, boolean[] arr, int i, StringBuilder sb) {

    if (i == s.length())
      return sb.toString();

    int x = s.charAt(i) - 'a';
    if (!arr[x]) {
      sb.append(s.charAt(i));
      arr[x] = true;
    }

    return checkDuplicate(s, arr, ++i, sb);
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    String s = "bhavvvissshya";
    boolean arr[] = new boolean[26];

    System.out.print(checkDuplicate(s, arr, 0, sb));
  }
}
