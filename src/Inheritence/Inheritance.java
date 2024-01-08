package Inheritence;


public class Inheritance {
  public static void main(String[] args) {
    /* Polimorfismo: Se puede heredar de padres a hijos pero no de hijos a padres lo mismo pasa para las clases hermanas */
    Person[] vector = new Person[5];
    vector[0] = new Person();
    vector[1] = new Employee();
    vector[2] = new Consultor();
    vector[3] = new Boss();



    /* Herenvia de clases */

/*    Employee employee1 = new Employee("Juan", "Perez", 30, "Calle 1", "1234567", 1000, "Programador", "Sistemas");
    Consultor consultor1 = new Consultor("Maria", "Lopez", 25, "Calle 2", "7654321", "Consultor 1", "1234567");
    List<Person> people = List.of(employee1, consultor1);
    people.forEach(person -> {
      if (person instanceof Employee) {
        ((Employee) person).showData();
      } else if (person instanceof Consultor) {
        ((Consultor) person).showData();
      } else {
        System.out.println("No se puede mostrar la informacion");
      }
    });

 */
  }
}