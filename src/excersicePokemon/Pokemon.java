package excersicePokemon;

public abstract class Pokemon {
  protected int pokedexNumber;
  protected String name;
  protected double weight;
  protected String gender;
  protected int season;

  protected abstract void normalAttack();
  protected abstract void scratchAtack();
  protected abstract void biteAttack();

}
