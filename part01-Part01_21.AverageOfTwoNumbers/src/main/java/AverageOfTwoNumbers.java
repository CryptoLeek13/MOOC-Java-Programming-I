
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(s.nextLine());
        double res = num1 + num2;
        double avg = (res / 2);
        System.out.println("The average is " + avg);

    }
}
