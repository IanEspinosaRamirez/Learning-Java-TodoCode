package abstracts;

public class Main {
  public static void main(String[] args) {
    Figure circle = new Circle(5, 0, 0);
    System.out.println(circle.calculateArea());
    Figure square = new Square(5, 0, 0);
    System.out.println(square.calculateArea());
  }
}
