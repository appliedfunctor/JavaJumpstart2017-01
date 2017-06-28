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

  @Override
  public String toString() {
    return getName();
  }
}
