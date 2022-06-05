
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
            System.out.println("Give the first number: ");
            // Store number1
            int number1 = Integer.valueOf(s.nextLine());
            System.out.println("Give the second number: ");
            // Store number 2
            int number2 = Integer.valueOf(s.nextLine());
            // Sum the res 
            int sum = number1 + number2;
            // print out res
            System.out.println("The sum of the numbers is " + sum);
    }
}
