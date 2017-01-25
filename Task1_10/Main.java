import java.util.Scanner;

/**
 * Start point of the program
 * Program forms square matrix
 * according entered order n
 * Matrix should have the following form:
 * 1  2    3    ...  n
 * n  n-1  n-2  ...  1
 * 1  2    3    ...  n
 * n  n-1  n-2  ...  1
 */
public class Main {
  /**
   * User enters the order of the square matrix.
   * Program forms square matrix
   * according entered order n
   *
   * @param - cmd argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter the order of the square matrix n.");
    Scanner scanner = new Scanner(System.in);
    int n = enterNumber(scanner);
    if (isEven(n)) {
      formMatrix(n);
    } else {
      System.out.println("Invalid data!");
    }
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
   * method checks if the entered order is even
   *
   * @param n - order of the square matrix
   * @return true if the entered order is even,
   * otherwise false
   */
  public static boolean isEven(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * method forms square matrix
   * according entered order n
   *
   * @param n - order of the square matrix
   */
  public static void formMatrix(int n) {
    int[][] array = new int[n][n];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (i % 2 == 0) {
          array[i][j] = j + 1;
        } else {
          array[i][j] = n - j;
        }
      }
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}