package Overcharge;

public class Animal {
  private int animalId;
  private String animalDescription;

  public void makeNoise() {
    System.out.println("Animal noise");
  }

  public void makeNoise(String animalName) {
    System.out.println("The animal " + animalName + "makes this noise");
  }
  public void makeNoise(String animalName, String animalNoise) {
    System.out.println("The animal " + animalName + "makes this noise: " + animalNoise);
  }
}
