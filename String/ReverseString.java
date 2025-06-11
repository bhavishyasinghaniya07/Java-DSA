public class ReverseString {

  public static char[] reversefunction(char[] arr, int i, int j) {
    if (i > j)
      return arr;

    char c = arr[i];
    arr[i] = arr[j];
    arr[j] = c;

    return reversefunction(arr, i + 1, j - 1);

  }

  public static void main(String args[]) {
    String s = "Bhavishya";
    char arr[] = s.toCharArray();
    System.out.println(s);
    reversefunction(arr, 0, s.length() - 1);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }
}
