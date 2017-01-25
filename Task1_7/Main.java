import java.util.Scanner;

/**
 * Start point of the program
 * Program calculates value of the function
 * on the entered segment with entered step.
 * The result should be presented as a table:
 * first column is the values of the arguments,
 * second - suitable value of the function
 */
public class Main {
  /**
   * User enters the values of the segment and step.
   * Program calculates value of the function
   * on the entered segment with entered step
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter segment.");
    Scanner scanner = new Scanner(System.in);
    double a = enterNumber(scanner);
    double b = enterNumber(scanner);
    System.out.println("Please, enter step.");
    double h = enterNumber(scanner);
    double newA = a;
    System.out.println("x                F(x)");
    while (belongsToTheSegment(newA, b)) {
      System.out.println(newA + "              " + calculateValueOfTheFunction(newA));
      newA = addStep(h, newA);
    }
  }

  /**
   * method returns entered data
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static double enterNumber(Scanner scanner) {
    return scanner.nextDouble();
  }

  /**
   * method calculates the value of the function
   *
   * @param a - value of the argument
   * @return value of the function
   */
  public static double calculateValueOfTheFunction(double a) {
    return (Math.pow(Math.sin(a), 2) - Math.cos(2 * a));
  }

  /**
   * method adds entered step to previous value of the argument
   * for next value of the argument
   *
   * @param h - step
   * @param a - value of the argument
   * @return new value of the argument
   */
  public static double addStep(double h, double a) {
    a += h;
    return a;
  }

  /**
   * method checks if the value of the argument
   * belongs to the segment
   *
   * @param a - value of the argument
   * @param b - the end of the entered segment
   * @return true if the value of the argument
   * belongs to the segment, otherwise false
   */
  public static boolean belongsToTheSegment(double a, double b) {
    if (a <= b) {
      return true;
    } else {
      System.out.println("Argument is out of bounds!");
      return false;
    }
  }
}