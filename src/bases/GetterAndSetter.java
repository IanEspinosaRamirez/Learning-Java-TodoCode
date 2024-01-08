package bases;

public class GetterAndSetter {
  public static void main(String[] args) {
    Student student1 = new Student(1, "Juan", "Perez");
    Student student2 = new Student(2, "Maria", "Lopez");
    System.out.println(student1.name);
    System.out.println(student2.name);
    System.out.println("=================   Student 2   ====================");
    student2.setName("Claudia");
    student2.setLastname("Ramirez");
    System.out.println(student2.getName());
    System.out.println(student2.getLastname());
  }
}
