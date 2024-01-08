package Inheritence;

public class Employee extends Person {
  double salary;
  String job;
  String department;

  public Employee() {
  }

  public Employee(String name, String lastname, int age, String address, String phone, double salary, String job, String department) {
    super(name, lastname, age, address, phone);
    this.salary = salary;
    this.job = job;
    this.department = department;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void showData() {
    System.out.println("Nombre: " + name);
    System.out.println("Apellido: " + lastname);
    System.out.println("Edad: " + age);
    System.out.println("Direccion: " + address);
    System.out.println("Telefono: " + phone);
    System.out.println("Salario: " + salary);
    System.out.println("Puesto: " + job);
    System.out.println("Departamento: " + department);
  }
}
