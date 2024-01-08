package excersicePokemon;

public class Charmander extends Pokemon implements IFire {
  @Override
  public void fireAttack() {
    System.out.println("Charmander fire attack");
  }

  @Override
  public void ember() {
    System.out.println("Charmander ember");
  }

  @Override
  protected void normalAttack() {
    System.out.println("Charmander normal atack");
  }

  @Override
  protected void scratchAtack() {
    System.out.println("Charmander scratch atack");
  }

  @Override
  protected void biteAttack() {
    System.out.println("Charmander bite atack");
  }
}
