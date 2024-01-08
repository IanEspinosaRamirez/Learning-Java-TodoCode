package excersicePokemon;

public class Bulbazour extends Pokemon implements IPlant, IWater{
  @Override
  protected void normalAttack() {
    System.out.println("Bulbazour normal atack");
  }

  @Override
  protected void scratchAtack() {
    System.out.println("Bulbazour scratch atack");
  }

  @Override
  protected void biteAttack() {
    System.out.println("Bulbazour bite atack");
  }

  @Override
  public void plantAttack() {
    System.out.println("Bulbazour plant attack");
  }

  @Override
  public void razorLeaf() {
    System.out.println("Bulbazour razor leaf");
  }

  @Override
  public void waterAttack() {
    System.out.println("Bulbazour water attack");
  }

  @Override
  public void bubble() {
    System.out.println("Bulbazour bubble");
  }
}
