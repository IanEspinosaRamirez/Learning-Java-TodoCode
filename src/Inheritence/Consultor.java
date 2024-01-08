package Inheritence;

public class Consultor extends Person {
  String consultorName;
  String consultorId;

  public Consultor() {
  }

  public Consultor(String name, String lastname, int age, String address, String phone, String consultorName, String consultorId) {
    super(name, lastname, age, address, phone);
    this.consultorName = consultorName;
    this.consultorId = consultorId;
  }

  public String getConsultorName() {
    return consultorName;
  }

  public void setConsultorName(String consultorName) {
    this.consultorName = consultorName;
  }

  public String getConsultorId() {
    return consultorId;
  }

  public void setConsultorId(String consultorId) {
    this.consultorId = consultorId;
  }

  public void showData() {
    System.out.println("Nombre: " + name);
    System.out.println("Apellido: " + lastname);
    System.out.println("Edad: " + age);
    System.out.println("Direccion: " + address);
    System.out.println("Telefono: " + phone);
    System.out.println("Nombre del consultor: " + consultorName);
    System.out.println("Id del consultor: " + consultorId);
  }
}
