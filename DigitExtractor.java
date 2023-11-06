import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;           // Extract the hundreds digit
            int digit2 = (number / 10) % 10;     // Extract the tens digit
            int digit3 = number % 10;            // Extract the ones digit

            System.out.println("100's Digit: " + digit1);
            System.out.println("10's Digit: " + digit2);
            System.out.println("1's Digit: " + digit3);
        } else {
            System.out.println(" enter a  3-digit number.");
        }

        scanner.close();
    }
}