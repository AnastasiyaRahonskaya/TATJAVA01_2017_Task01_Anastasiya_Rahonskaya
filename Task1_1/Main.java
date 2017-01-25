import java.util.Scanner;

/**
 * Start point of the program
 * Program takes a four-digit number and
 * returns "true", if the statement is true,
 * otherwise "false"
 * The statement:
 * The sum of the first two numerals of a given
 * number is the sum of his last two numerals
 */
public class Main {
  /**
   * User enters a four-digit number.
   * Program checks if entered number is valid.
   * If true divides entered number by the numerals
   * and checks the statement
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.print("Please, enter a four-digit number: ");
    Scanner scanner = new Scanner(System.in);
    int number = enterNumber(scanner);
    System.out.println("Your number: " + number);
    if (checkValidation(number)) {
      divideTheNumberAndCheckTheCondition(number);
    } else {
      System.out.println("Invalid data!");
    }
  }

  /**
   * method returns entered number
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static int enterNumber(Scanner scanner) {
    return scanner.nextInt();
  }

  /**
   * method for checking if entered number is four-digit
   *
   * @param number - entered data
   * @return true if the number is four-digit, otherwise false
   */
  public static boolean checkValidation(int number) {
    boolean check = (1000 <= number) && (number <= 9999);
    if (check) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * method divides entered number by the numerals
   * and check if if is suitable for given statement
   *
   * @param number - entered number
   */
  public static void divideTheNumberAndCheckTheCondition(int number) {
    int firstNumber = number / 1000;
    int secondNumber = number / 100 % 10;
    int thirdNumber = number / 10 % 10;
    int forthNumber = number % 10;
    if (firstNumber + secondNumber == thirdNumber + forthNumber) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
