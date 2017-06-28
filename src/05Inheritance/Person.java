/**
 * @author Alexander Worton.
 */
public interface Person {
  /**
   * A setter for the first name field only.
   * This should throw an InvalidArgumentException if supplied with a null
   * @param fname the firstname
   */
  void setFirstName(String fname);

  /**
   * A setter for the last name field only.
   * This should throw an InvalidArgumentException if supplied with a null
   * @param sname the surname
   */
  void setSurName(String sname);

  /**
   * A getter for the whole name.
   * @return FullName
   */
  String getName();
}
