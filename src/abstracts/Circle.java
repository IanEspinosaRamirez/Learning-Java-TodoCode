package abstracts;

public class Circle extends Figure{
  private double radius;
  public Circle() {
  }
  public Circle(double radius, double posX, double posY) {
    super(posX, posY);
    this.radius = radius;
  }
  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
  }