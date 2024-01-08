package Inheritence;

public class Person {
  String name;
  String lastname;
  int age;
  String address;
  String phone;

  public Person() {
  }

  public Person(String name, String lastname, int age, String address, String phone) {
    this.name = name;
    this.lastname = lastname;
    this.age = age;
    this.address = address;
    this.phone = phone;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
