import java.util.Scanner;

/**
 * Start point of the program
 * Program calculates given expression's value
 */
public class Main {
  /**
   * User enters three numbers.
   * Program checks if entered numbers is suitable
   * for given expression.
   * If true program calculates the expression's value
   * otherwise outputs suitable message
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter three numbers");
    Scanner scanner = new Scanner(System.in);
    double a = enterNumbers(scanner);
    double b = enterNumbers(scanner);
    double c = enterNumbers(scanner);
    if (checkNumbers(a, b, c)) {
      System.out.println("The answer: " + calculateTheValueOfExpression(a, b, c));
    } else {
      System.out.println("No valid data!");
    }
  }

  /**
   * method returns entered numbers
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static double enterNumbers(Scanner scanner) {
    return scanner.nextDouble();
  }

  /**
   * method calculates the expression's value
   *
   * @param a - entered number
   * @param b - entered number
   * @param c - entered number
   * @return expression's answer
   */
  public static double calculateTheValueOfExpression(double a, double b, double c) {
    return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
  }

  /**
   * method checks if entered numbers is suitable
   * for given expression
   *
   * @param a - entered number
   * @param b - entered number
   * @param c - entered number
   * @return true if entered numbers is suitable
   * for given expression otherwise false
   */
  public static boolean checkNumbers(double a, double b, double c) {
    if (a < 0 || b < 0 || c < 0) {
      return false;
    } else {
      return true;
    }
  }
}