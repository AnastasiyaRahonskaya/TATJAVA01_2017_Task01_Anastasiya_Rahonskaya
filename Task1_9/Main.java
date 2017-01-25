import java.util.Scanner;

/**
 * Start point of the program
 * Program combines two array in one,
 * include the second array between
 * k and (k+1) elements in the first array
 */
public class Main {
  /**
   * User enters length and numbers for two array and K.
   * Program fills the arrays in with entered numbers,
   * checks if entered K  <= the length of the first array.
   * If true program combines two array in one,
   * include the second array between k and (k+1) elements
   * in the first array, otherwise suitable message appears
   *
   * @param args - cmd argument
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter the length of the array.");
    int n1 = enterNumber(scanner);
    System.out.println("Please, enter elements of the array.");
    double[] array1 = fillArray(n1, scanner);

    System.out.println("Please, enter the length of the array.");
    int n2 = enterNumber(scanner);
    System.out.println("Please, enter elements of the array.");
    double[] array2 = fillArray(n2, scanner);

    System.out.println("Please, enter K.");
    int k = enterNumber(scanner);
    if (checkCondition(array1, k)) {
      formNewArray(array1, array2, k);
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
  public static double[] fillArray(int n, Scanner scanner) {
    double[] array = new double[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  /**
   * method forms new array
   *
   * @param array1 - first array
   * @param array2 - second array
   * @param k      - entered number
   * @return new array
   */
  public static double[] formNewArray(double[] array1, double[] array2, int k) {
    double[] newArray = new double[array1.length + array2.length];
    for (int i = 0; i <= k; i++) {
      newArray[i] = array1[i];
    }
    int j = 0;
    for (int i = k + 1; i < newArray.length; i++) {
      if (j < array2.length) {
        newArray[i] = array2[j];
        j++;
      }
    }
    j = k + 1;
    for (int i = k + 1 + array2.length; i < newArray.length; i++) {
      if (j < array1.length) {
        newArray[i] = array1[j];
        j++;
      }
    }
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + " ");
    }
    return newArray;
  }

  /**
   * method checks if K <= the length of the first array
   *
   * @param array1 - first array
   * @param k      - entered number
   * @return true if K <= the length of the first array,
   * otherwise false
   */
  public static boolean checkCondition(double[] array1, int k) {
    boolean check = k <= array1.length - 1;
    if (check) {
      return true;
    } else return false;
  }
}