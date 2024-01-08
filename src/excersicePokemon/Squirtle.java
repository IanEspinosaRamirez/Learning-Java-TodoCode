package excersicePokemon;

public class Squirtle extends Pokemon implements IWater{

  @Override
  public void waterAttack() {
    System.out.println("Squirtle water attack");
  }

  @Override
  public void bubble() {
    System.out.println("Squirtle bubble");
  }

  @Override
  protected void normalAttack() {
    System.out.println("Squirtle normal attack");
  }

  @Override
  protected void scratchAtack() {
    System.out.println("Squirtle scratch attack");
  }

  @Override
  protected void biteAttack() {
    System.out.println("Squirtle bite attack");
  }
}
