package interfaces;

public class Circle implements IShape, IDrawable, IRotable {
  private double radius;
  public Circle() {
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public void draw() {
    System.out.println("Drawing circle");
  }

  @Override
  public void rotate() {
     System.out.println("Rotating circle");
  }
}
