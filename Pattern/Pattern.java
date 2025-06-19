
public class Pattern {

  public static void pattern1(int r) {

    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }

  }

  public static void pattern2(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r - i; j++) {
        System.out.print("   ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public static void pattern3(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r - i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public static void pattern4(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("   ");
      }
      for (int k = 1; k <= r - i; k++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  // public static void pattern5(int r) {

  // for (int i = 1; i <= r / 2; i++) {
  // for (int j = i; j <= r / 2; j++) {
  // System.out.print(" ");
  // }
  // for (int k = 1; k <= (r / 2) + 2 - i; k = k + 2) {
  // System.out.print(" * ");
  // }
  // System.out.println();
  // }

  // for (int i = 1; i <= r; i++) {
  // System.out.print(" * ");
  // }
  // System.out.println();

  // for (int i = 1; i <= r / 2; i++) {
  // for (int j = 1; j <= r / 2 - i; j++) {
  // System.out.print(" ");
  // }
  // for (int k = 1; k <= (r / 2) + 1 - i; k = k + 2) {
  // System.out.print(" * ");
  // }
  // System.out.println();
  // }
  // }

  public static void pattern6(int r) {
    for (int i = 1; i <= r / 2 + 1; i++) {
      for (int j = 1; j <= (r / 2) + 2 - i; j++) {
        System.out.print(" * ");
      }

      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("   ");
      }

      for (int j = 1; j <= (r / 2) + 2 - i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }

    for (int i = r / 2; i >= 1; i--) {
      for (int j = 1; j <= (r / 2) + 2 - i; j++) {
        System.out.print(" * ");
      }

      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("   ");
      }

      for (int j = 1; j <= (r / 2) + 2 - i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public static void pattern7(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("   ");
      }
      System.out.println(" * ");
    }
  }

  public static void pattern8(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = i; j <= r; j++) {
        System.out.print("   "); 
      }
      System.out.println(" * ");
    }
  }

  // public static void pattern9(int r) {
  // for (int i = 1; i <= r; i++) {
  // for (int j = 1; j < i; j++) {
  // System.out.print(" ");
  // }
  // System.out.print(" * ");
  // for (int j = 1; j <= 2 * i + 2;j++) {
  // System.out.print(" ");
  // }
  // System.out.print(" * ");
  // System.out.println();
  // }
  // }

  // public static void pattern10(int r){
  // for(int i=1;i<=r;i++){
  // for(int j=1;j<=(r/2)-i+1;j++){
  // System.out.print(" ");
  // }
  // System.out.print(" * ");
  // }
  // }
  public static void main(String[] args) {
    pattern8(5);
  }
}