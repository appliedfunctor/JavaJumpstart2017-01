/**
 * @author Alexander Worton.
 */
public interface Creature {
  /**
   * A reproduce method to receive another creature and mate with it.
   * @param other the other creature
   * @return a new spawn
   */
  Creature reproduce(Creature other);

  /**
   * A getter for the creature's name.
   * @return
   */
  String getName();

  /**
   * A setter for the creatures name.
   * @param name
   */
  void setName(String name);
}
