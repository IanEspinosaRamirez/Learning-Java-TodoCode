package abstracts;

public class Square extends Figure {
  private double side;

  public Square() {
  }

  public Square(double side, double posX, double posY) {
    super(posX, posY);
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side * side;
  }
}
