import java.util.Scanner;

/**
 * Start point of te program
 * Program finds max and min number
 * out of three entered and
 * calculates their sum
 */
public class Main {
  /**
   * User enters three numbers.
   * Program finds max and min number
   * out of three entered and
   * calculates their sum
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter three numbers.");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = enterNumber(scanner);
    double secondNumber = enterNumber(scanner);
    double thirdNumber = enterNumber(scanner);
    double[] arrayOfNumbers = {firstNumber, secondNumber, thirdNumber};
    double minNumber = findMinNumber(arrayOfNumbers);
    double maxNumber = findMaxNumber(arrayOfNumbers);
    System.out.println("Sum: " + calculateSumOfMinAndMaxNumber(minNumber, maxNumber));
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
   * method finds min number out of three entered
   *
   * @param arrayOfNumbers - array of three entered numbers
   * @return min number
   */
  public static double findMinNumber(double[] arrayOfNumbers) {
    double min = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] < min) {
        min = arrayOfNumbers[i];
      }
    }
    return min;
  }

  /**
   * method finds max number out of three entered
   *
   * @param arrayOfNumbers - array of three entered numbers
   * @return max number
   */
  public static double findMaxNumber(double[] arrayOfNumbers) {
    double max = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] > max) {
        max = arrayOfNumbers[i];
      }
    }
    return max;
  }

  /**
   * method calculates the sum of min and max numbers
   * out of three entered
   *
   * @param minNumber - min entered number
   * @param maxNumber - max entered number
   * @return sum
   */
  public static double calculateSumOfMinAndMaxNumber(double minNumber, double maxNumber) {
    return (minNumber + maxNumber);
  }
}