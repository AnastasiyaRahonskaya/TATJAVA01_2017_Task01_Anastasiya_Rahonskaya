import java.util.Scanner;

/**
 * Start point of the program
 * Program calculates the sum of the elements
 * that are multiple to the entered number K
 */
public class Main {
  /**
   * User enters the length of the array,
   * the numbers and number K
   * Program fills the array in with entered numbers
   * and calculates the sum of the elements
   * that are multiple to the entered number K
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter the quantity of elements in the array.");
    Scanner scanner = new Scanner(System.in);
    int n = enterNumber(scanner);
    System.out.println("Please, enter K.");
    int k = enterNumber(scanner);
    System.out.println("Please, enter elements of the array.");
    int[] filledArray = fillArray(n, scanner);
    System.out.println("Sum: " + calculateSum(filledArray, k));
  }

  /**
   * method returns entered data
   *
   * @param scanner - object of the class Scanner
   * @return entered data
   */
  public static int enterNumber(Scanner scanner) {
    return scanner.nextInt();
  }

  /**
   * method fills the array in with entered numbers
   *
   * @param n       - length of the array
   * @param scanner - object of the class Scanner
   * @return filled array
   */
  public static int[] fillArray(int n, Scanner scanner) {
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  /**
   * method calculates the sum of the elements
   * that are multiple to the entered number K
   *
   * @param filledArray - filled array
   * @param k           - entered number
   * @return sum
   */
  public static int calculateSum(int[] filledArray, int k) {
    int sum = 0;
    for (int i = 0; i < filledArray.length; i++) {
      if (filledArray[i] % k == 0) {
        sum += filledArray[i];
      }
    }
    return sum;
  }
}