
// creating a class student ,which is a blueprint/layout by which we can create
// multiple objects for different students

// Here we are setting marks to private and used getter and setter to access the 
// marks which enhance the data security 

// Here we are using encapsulation means both variable and methods are inside a
// single capsule . 

// the variables must not be directly accessible , it will voilet the conditions
// of encapsulation 

public class Student {
  String name;
  int age;
  private int marks;

  System.out.println("This is the student class.")

  public Student(String name, int age) {
    this.name = name;
    this.age = age;

  }

  public void setMarks(int marks) {
    // encapsulation makes the code flexible , we can apply conditions on the inputs
    if (marks < 0) {
      System.out.println("Marks can not be negative");

    } else {
      this.marks = marks;
    }
  }

  public int getMarks() {
    return this.marks;
  }
}
