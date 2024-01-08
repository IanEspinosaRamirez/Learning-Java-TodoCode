package interfaces;

public class InterfacesImpl {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Area of circle: " + circle.calculateArea());
    circle.draw();
    circle.rotate();
    Square square = new Square(5);
    System.out.println("Area of square: " + square.calculateArea());
    square.draw();
  }
}
