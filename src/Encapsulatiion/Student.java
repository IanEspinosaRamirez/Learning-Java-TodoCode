package Encapsulatiion;

public class Student {
  int id;
  String name;
  String lastname;

  public Student() {
  }

  public Student(int id, String name, String lastname) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
}
