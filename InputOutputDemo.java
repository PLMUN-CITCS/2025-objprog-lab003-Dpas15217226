import java.util.Scanner;

public class InputOutputDemo {
  public static void main(String[] args) {
    // Create a scanner object to get input from the user
    Scanner scanner = new Scanner(System.in);

    // Get the integer input
    System.out.print("Enter an integer: ");
    int userInt = scanner.nextInt();

    // Get the decimal (floating-point) input
    System.out.print("Enter a decimal number: ");
    double userDecimal = scanner.nextDouble();

    // Consume the newline character left after nextDouble()
    scanner.nextLine();

    // Get the string input (word or sentence)
    System.out.print("Enter a word or sentence: ");
    String userString = scanner.nextLine();

    // Display the entered values
    System.out.println("Your integer: " + userInt);
    System.out.printf("Your decimal number: %.2f\n", userDecimal);  // Formatting decimal to 2 decimal places
    System.out.println("Your string: " + userString);

    // Close the scanner to prevent resource leaks
    scanner.close();
  }
}
