
public class Basics_c1 {

  public static void main(String[] args) {
    Student s1 = new Student("RamLal", 21);

    System.out.println("Name : " + s1.name);
    System.out.println("Age : " + s1.age);
    s1.setMarks(-12);
    System.out.println("Marks : " + s1.getMarks());

    ScienceStudent ss1 = new ScienceStudent("Mohan", 44);

  }

}
