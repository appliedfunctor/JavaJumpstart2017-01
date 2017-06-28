public class CreatureApp {
  /**
   * The entry point to the program
   * @param args Command line arguments, as an array of strings.
   */
	public static void main (String[] args) {
    Creature spawn1 = getCatOffspring("Purrdey", "Scratcher");
    Creature spawn2 = getBirdOffspring("Flappy", "Diver");

    // Notice the names of the children. What should they have been?
    // Why are they the way they are? Look at the keywords super and this.
		System.out.println(spawn1.getName()); // expect Scrdey, get Scrdey
		System.out.println(spawn2.getName()); //expect Divtppy, get Divtym <--
	}

  /**
   * A helper method to return a spawn from a newly mated mother and father cat.
   * @param father the male cat
   * @param mother the female cat
   * @return The result of the fun they had
   */
	private static Creature getCatOffspring(String father, String mother) {
    Creature creature = new Cat();
    creature.setName(father);
    Creature secondCreature = new Cat();
    secondCreature.setName(mother);
    return creature.reproduce(secondCreature);
  }

  /**
   * A helper method to return a spawn from a newly mated mother and father bird.
   * @param father the male bird
   * @param mother the female bird
   * @return The result of the fun they had
   */
  private static Creature getBirdOffspring(String father, String mother) {
    Creature creature = new Bird();
    creature.setName(father);
    Creature secondCreature = new Bird();
    secondCreature.setName(mother);
    return creature.reproduce(secondCreature);
  }
}
