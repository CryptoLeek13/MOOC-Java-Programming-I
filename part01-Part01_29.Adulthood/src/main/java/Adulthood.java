
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int age = Integer.valueOf(s.nextLine());
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
