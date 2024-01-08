package bases;

public class Student {
  // Atributos de la clase Student (variables)
  int id;
  String name;
  String lastname;

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

  public void showData() {
    System.out.println("Id: " + id);
    System.out.println("Nombre: " + name);
    System.out.println("Apellido: " + lastname);
  }
  public void studentAproved(double calificacion) {
    if (calificacion >= 6) {
      System.out.println("Aprobado");
    } else {
      System.out.println("Reprobado");
    }
  }

}
