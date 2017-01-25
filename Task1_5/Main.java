import java.util.Scanner;

/**
 * Start point if the program
 * Program takes three real numbers.
 * If the number is non-negative, program
 * makes it in two times bigger
 * If the number is negative -
 * in four times bigger
 */
public class Main {
  /**
   * User enters three real numbers.
   * Program checks if the number is non-negative,
   * it takes it in two times bigger
   * If the number is negative - in four times bigger
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter three numbers");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = enterNumber(scanner);
    double secondNumber = enterNumber(scanner);
    double thirdNumber = enterNumber(scanner);
    satisfyTheCondition(firstNumber, secondNumber, thirdNumber);
  }

  /**
   * method returns entered numbers
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static double enterNumber(Scanner scanner) {
    return scanner.nextDouble();
  }

  /**
   * method checks for what condition
   * each number satisfies
   *
   * @param firstNumber  - entered number
   * @param secondNumber - entered number
   * @param thirdNumber  - entered number
   */
  public static void satisfyTheCondition(double firstNumber, double secondNumber, double thirdNumber) {
    double result;
    double[] arrayOfNumbers = {firstNumber, secondNumber, thirdNumber};
    for (int i = 0; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] >= 0) {
        result = Math.pow(arrayOfNumbers[i], 2);
      } else {
        result = Math.pow(arrayOfNumbers[i], 4);
      }
      System.out.println(result);
    }
  }
}