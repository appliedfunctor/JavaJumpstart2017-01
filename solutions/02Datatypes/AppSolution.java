public class AppSolution {
  public static void main(String[] args) {
    int age = 5;
    boolean isHappy = true;

    Integer legs = new Integer(2);
    Integer arms = 2;
    int knees = 2;
    int feet = 2;

    Integer otherLegs = legs;

    System.out.println("Arms: " + arms);
    System.out.println("Legs: " + legs);

    if(isHappy) {
      System.out.println("Age: " + age);
    }

    //false complex types even with the same values exist at different memory locations
    System.out.println("legs == arms is " + (legs == arms));

    //memory reference matches
    System.out.println("legs == arms is " + (legs == otherLegs));

    //this works because of auto unboxing of the Integer
    System.out.println("legs == knees is " + (legs == knees));

    //simple types with the same value
    System.out.println("feet == knees is " + (feet == knees));
  }
}
