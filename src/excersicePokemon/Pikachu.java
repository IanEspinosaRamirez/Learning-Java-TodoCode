package excersicePokemon;

public class Pikachu extends Pokemon implements IElectric{
  @Override
  protected void normalAttack() {
    System.out.println("Pikachu normal atack");
  }

  @Override
  protected void scratchAtack() {
    System.out.println("Pikachu scratch atack");
  }

  @Override
  protected void biteAttack() {
    System.out.println("Pikachu bite attack");
  }

  @Override
  public void electricAttack() {
    System.out.println("Pikachu electric attack");
  }

  @Override
  public void thunderShock() {
    System.out.println("Pikachu thunder shock");
  }
}
