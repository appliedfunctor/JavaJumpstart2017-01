/**
 * @author Alexander Worton.
 */
public abstract class AbstractCreature implements Creature {

  /** The internal name field, initialised to a value **/
  protected String name = "Unnamed";

  /**
   * {@inheritDoc}.
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }
}
