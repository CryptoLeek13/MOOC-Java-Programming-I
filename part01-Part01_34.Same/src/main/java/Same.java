
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String same1 = s.nextLine();
        System.out.println("Enter the second string:");
        String same2 = s.nextLine();
        if (same1.equals(same2)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
