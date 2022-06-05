
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(s.nextLine());
        if (number > 0){
            System.out.println("The number is positive."); 
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
