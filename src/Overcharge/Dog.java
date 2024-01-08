package Overcharge;

public class Dog extends AbstractAnimal{
  private String dogName;
  private String dogBreed;
  private double dogWeight;
  private double dogHeight;

  @Override
  public void makeNoise() {
    System.out.println("I'm a dog and I make this noise: woof woof");
  }
}
