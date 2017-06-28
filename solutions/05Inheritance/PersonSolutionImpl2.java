/**
 * @author Alexander Worton.
 */
public class PersonSolutionImpl2 extends AbstractPersonSolution {
  /**
   * {@inheritDoc}.
   */
  @Override
  public String getName() {
    return this.sname + ", " + this.fname;
  }
}
