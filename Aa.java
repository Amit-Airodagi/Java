import java.util.Scanner;

public class Aa 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 3 == 0 && number % 4 == 0 && number % 5 == 0)
 {
            System.out.println("hi hello");
        } else if (number % 3 == 0) 
{
            System.out.println("hi");
        } else if (number % 4 == 0)
 {
            System.out.println("hello");
        } else
 {
            System.out.println("Number is not divisible by 3, 4, or 5");
        }
    }
}