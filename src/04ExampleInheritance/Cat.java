public class Cat extends AbstractCreature {

	/**
	 * The internal name field, initialised to a value.
	 * This is to demonstrate shadowing on the super's implementation.
	 */
	private String name = "Tiddles";

	/**
	 * {@inheritDoc}.
	 */
	@Override
	public Creature reproduce(Creature other) {
		Cat newCat = new Cat();
		newCat.setName(other.getName()
				.substring(0,getName().length()/2) + super.name.substring(super.name.length()/2));
		return newCat;
	}

	/**
	 * A sneaky method that takes and returns no arguments, with no side effects.
	 * Do not underestimate the sneakiness.
	 */
	public void sneak() {
		//do something sneaky
	}

	/**
	 * Cats speaking - whatever next?
	 */
	public void speak() {
		System.out.println("Meeow");
	}
}
