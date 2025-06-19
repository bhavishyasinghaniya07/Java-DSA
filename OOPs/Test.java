// ✅ INTERFACE EXAMPLE: Defines a contract that must be implemented by classes
interface Student {
  int stuId = 233; // by default: public static final

  // Abstract method (no body)
  void stuName(int stuId);
}

// ✅ Class implementing an interface → must provide method body
class Stu implements Student {
  @Override
  public void stuName(int stuId) {
    System.out.println("Hi, this is class Stu implementing interface Student with stu id - " + stuId);
  }
}

// ✅ ABSTRACT CLASS EXAMPLE: Cannot be instantiated directly, contains abstract
// methods
abstract class Sem {
  public abstract void semName(); // abstract method - no body

  public abstract void semRoom(); // abstract method - no body
}

// ✅ Subclass providing concrete implementation of abstract methods
class Sem1 extends Sem {
  @Override
  public void semName() {
    System.out.println("Hi, this is Sem1 class extending Sem");
  }

  @Override
  public void semRoom() {
    System.out.println("Classes for Sem1 will be conducted in C-320");
  }
}

// ✅ NORMAL CLASS demonstrating encapsulation (private field + getter)
class MBC {
  private int scholar; // encapsulation: private field
  String name; // default access (package-private)

  // Constructor
  public MBC(int s, String n) {
    this.scholar = s;
    this.name = n;
  }

  // Method
  public void Intro() {
    System.out.println("Hi, I am " + name + " from MBC Department");
  }

  // Getter to access private scholar ID
  public int getScholar() {
    return scholar;
  }
}

// ✅ INHERITANCE + POLYMORPHISM: MCA extends MBC, overrides Intro()
class MCA extends MBC {
  private float cgpa;

  public MCA(int s, String n, float cgpa) {
    super(s, n); // calls MBC constructor
    this.cgpa = cgpa;
  }

  @Override
  public void Intro() {
    // Using super.getScholar() to access private scholar field
    System.out.println("Hi, I am " + name + " from MCA Course with Scholar ID " + getScholar() + " and CGPA " + cgpa);
  }
}

// ✅ DRIVER CLASS
public class Test {
  public static void main(String[] args) {
    // OBJECT CREATION → MBC and MCA
    MBC s1 = new MBC(101, "Bhavishya");
    s1.Intro(); // calls MBC version

    MCA s2 = new MCA(102, "Manish", 7.89f);
    s2.Intro(); // calls MCA overridden version

    // POLYMORPHISM → superclass reference holding subclass object
    MBC polyMbc = new MCA(103, "Ravi", 8.1f);
    polyMbc.Intro(); // runtime polymorphism

    // ABSTRACT CLASS example
    Sem sem = new Sem1(); // Sem1 is concrete, Sem is abstract
    sem.semName();
    sem.semRoom();

    // INTERFACE example
    Student student = new Stu();
    student.stuName(555);
  }
}
