public class Inheritance {

  static class MBC {
    int sNo;
    String name;

    public MBC(int s, String name) {
      this.sNo = s;
      this.name = name;
    }

    public void intro() {
      System.out.println("Hi everyone , I am " + this.name + " from the MBC department");
    }
  }

  static class MCA extends MBC {
    String course = "MCA";

    public MCA(int s, String name) {
      super(s, name);
    }

    @Override
    public void intro() {
      System.out.println("Hii everyone , I am " + this.name + " from the " + course + " Course");
    }
  }

  public static void main(String[] args) {
    MBC s1 = new MBC(101, "Bhavishya");
    s1.intro();

    MCA s2 = new MCA(102, "Ritik");
    s2.intro();
  }
}
