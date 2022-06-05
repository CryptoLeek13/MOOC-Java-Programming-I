
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Write a program that asks the user for three numbers afterwards print the sum of the three nums
        
        // Create entry message
        System.out.println("Give the first number: ");
        // Store num1 in var
        int num1 = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number: ");
        // Store num2 var
        int num2 = Integer.valueOf(s.nextLine());
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        
        

    }
}
