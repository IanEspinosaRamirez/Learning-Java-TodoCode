package interfaces;

public class Square implements IShape,IDrawable {
  private double side;
  public Square() {
  }
public Square(double side) {
    this.side = side;
  }
  @Override
  public double calculateArea() {
    return side * side;
  }

  @Override
  public void draw() {
    System.out.println("Drawing square");
  }
}