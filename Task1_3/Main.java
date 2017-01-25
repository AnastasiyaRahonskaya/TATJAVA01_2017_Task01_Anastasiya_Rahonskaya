import java.util.Scanner;

/**
 * Start point of the program
 * Program calculates perimetr and
 * square of the right triangle
 */
public class Main {
  /**
   * User enters two cathetuses of the right triangle.
   * Program checks if entered data is valid.
   * If true program calculates the perimetr
   * and square of the right triangle,
   * otherwise suitable message appears
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter two cathetuses of the right triangle");
    Scanner scanner = new Scanner(System.in);
    double a = enterCathetus(scanner);
    double b = enterCathetus(scanner);
    if (isExist(a, b)) {
      System.out.println("Perimetr: " + getPerimetr(a, b));
      System.out.println("Square: " + getSquare(a, b));
    } else {
      System.out.println("Wrong data!");
    }
  }

  /**
   * method returns entered data
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static double enterCathetus(Scanner scanner) {
    return scanner.nextDouble();
  }

  /**
   * method gets the perimetr of the right triangle
   *
   * @param a - cathetus of the right triangle
   * @param b - cathetus of the right triangle
   * @return perimetr
   */
  public static double getPerimetr(double a, double b) {
    return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
  }

  /**
   * method gets the square of the right triangle
   *
   * @param a - cathetus of the right triangle
   * @param b - cathetus of the right triangle
   * @return square
   */
  public static double getSquare(double a, double b) {
    return ((a * b) / 2);
  }

  /**
   * method checks if the entered data is valid
   *
   * @param a - cathetus of the right triangle
   * @param b - cathetus of the right triangle
   * @return true if entered data is valid,
   * otherwise false
   */
  public static boolean isExist(double a, double b) {
    if (a > 0 && b > 0) {
      return true;
    } else {
      return false;
    }
  }
}