/**
 * @author Alexander Worton.
 */
public class ProgramSolution {
  /**
   * The entry point to the program
   * @param args Command line arguments, as an array of strings.
   */
  public static void main(String[] args) {
    PersonSolution person1 = applyName(new PersonSolutionImpl1(), "Justin", "Bieber");
    PrintPerson(person1);

    PersonSolution person2 = applyName(new PersonSolutionImpl2(), "Michael", "Buble");
    PrintPerson(person2);
  }

  private static PersonSolution applyName(PersonSolution person, String fname, String sname) {
    person.setFirstName(fname);
    person.setSurName(sname);
    return person;
  }

  /**
   * A helper method to print the name of the supplied person.
   * @param person The supplied person.
   */
  private static void PrintPerson(PersonSolution person) {
    System.out.println(person.getName());
  }
}
