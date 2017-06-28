/**
 * @author Alexander Worton.
 */
public abstract class AbstractPersonSolution implements PersonSolution {

  /**
   * Private fields for name components.
   */
  protected String fname;
  protected String sname;

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setFirstName(String fname) {
    this.fname = fname;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setSurName(String sname) {
    this.sname = sname;
  }

  /**
   * This overrides the toString method inherited from Object.
   * Since we wrote a PrintPerson function, we didn't need this,
   * however println calls the toString method on an object to get
   * the output that it prints to console, so with this we could drop
   * the PrintPerson helper method and just pass the object to println.
   * @return
   */
  @Override
  public String toString() {
    return getName();
  }
}
