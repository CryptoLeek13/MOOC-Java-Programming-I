
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // write your program here
        System.out.println("Write something: ");
        Boolean value = Boolean.valueOf(s.nextLine());
        System.out.println("True or false? " + value);

    }
}
