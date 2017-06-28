/**
 * @author Alexander Worton.
 */
public class Bird extends AbstractCreature {

  /**
   * The internal name field, initialised to a value.
   * This is to demonstrate shadowing on the super's implementation.
   */
  private String name = "Twittyum";

  /**
   * {@inheritDoc}.
   */
  @Override
  public Creature reproduce(Creature other) {
    Bird bird = new Bird();
    bird.setName(other.getName()
            .substring(0,getName().length()/2) + this.name.substring(this.name.length()/2));
    return bird;
  }
}
