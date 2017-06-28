/**
 * @author Alexander Worton.
 */
public class PersonSolutionImpl1 extends AbstractPersonSolution {
  /**
   * {@inheritDoc}.
   */
  @Override
  public String getName() {
    return this.fname + " " + this.sname;
  }
}
