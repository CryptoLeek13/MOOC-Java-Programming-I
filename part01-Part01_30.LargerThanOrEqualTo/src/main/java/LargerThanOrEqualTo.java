
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(s.nextLine());
        if (num1 > num2){
            System.out.println("Greater number is: " + num1);
        }else if (num1 < num2){
            System.out.println("Greater number is: " + num2);
        }else {
            System.out.println("The numbers are equal!");
        }

    }
}
