import java.util.Scanner;

/**
 * Start point of the program
 * Program takes two coordinates and
 * returns "true" if the resulting point belongs
 * to the shaded area, otherwise "false"
 */
public class Main {
  /**
   * User enters two coordinates.
   * Program checks if the resulting point
   * belongs to the shaded area
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter x and y");
    Scanner scanner = new Scanner(System.in);
    double x = enterCoordinate(scanner);
    double y = enterCoordinate(scanner);
    if (checkCondition(x, y)) {
      System.out.println("Entered coordinates belongs to the shaded area.");
    } else {
      System.out.println("Entered coordinates doesn't belong to the shaded area.");
    }

  }

  /**
   * method returns entered numbers
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static double enterCoordinate(Scanner scanner) {
    return scanner.nextDouble();
  }

  /**
   * method checks if the resulting
   * point belongs to the shaded area
   *
   * @param x - entered coordinate
   * @param y - entered coordinate
   */
  public static boolean checkCondition(double x, double y) {
    boolean conditionOne = (-2 <= x) && (x <= 2) && (0 <= y) && (y <= 4);
    boolean conditionTwo = (-4 <= x) && (x <= 4) && (-3 <= y) && (y <= 0);
    if (conditionOne || conditionTwo) {
      return true;
    } else {
      return false;
    }
  }
}