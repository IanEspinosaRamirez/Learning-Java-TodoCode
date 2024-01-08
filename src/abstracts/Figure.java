package abstracts;

public abstract class Figure {
  /* las clases abstractas dicen que es el objeto pero pueden tener algunos metodos para la instancia del mismo asi mismo deben tener al memos un metodo abstracto*/
protected double posX;
protected double posY;
public Figure() {
}
public Figure(double posX, double posY) {
  this.posX = posX;
  this.posY = posY;
}
public abstract double calculateArea();

}
