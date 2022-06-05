
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(s.nextLine());
        int add = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        double avg = 1.0 * num1 / num2;
        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + avg);
    }
}
